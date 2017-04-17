/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador_jpm;

import Modelo_jpm.Proveedores;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class RegProveedores extends HttpServlet {

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
        String NOMBRE_PROVEEDORES=request.getParameter("proveedor");
        String RUC_PROVEEDORES=request.getParameter("ruc_prov");
        String TELEFONO_PROVEEDORES=request.getParameter("telfProv");
        
        Proveedores p = new Proveedores(NOMBRE_PROVEEDORES, RUC_PROVEEDORES, TELEFONO_PROVEEDORES);
        
        p.setNOMBRE_PROVEEDORES(NOMBRE_PROVEEDORES);
        p.setRUC_PROVEEDORES(RUC_PROVEEDORES);
        p.setTELEFONO_PROVEEDORES(TELEFONO_PROVEEDORES);
       
        
        
         if(p.inserta()){
            request.getRequestDispatcher("proveedores.jsp").forward(request, response);
            System.out.println("registro realizado correctamente");
        }
        else{
            request.getRequestDispatcher("proveedores.jsp").forward(request, response);
            System.err.println("error");
        }
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
