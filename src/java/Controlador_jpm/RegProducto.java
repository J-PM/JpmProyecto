package Controlador_jpm;

import Modelo_jpm.Producto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegProducto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom_producto = request.getParameter("detalle");
        String unida_producto = request.getParameter("unidad");
        String valor_producto = request.getParameter("costo");
        Producto p = new Producto(nom_producto, unida_producto, valor_producto);
        p.setNom_producto(nom_producto);
        p.setUnidad_producto(unida_producto);
        p.setValor_producto(valor_producto);
        
        if(p.insertar()){
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
            
        
        }else{
           
            request.getRequestDispatcher("error_registro.jsp").forward(request, response);
        }
    
    }

    

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
