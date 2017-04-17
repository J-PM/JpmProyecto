/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador_jpm;

import Modelo_jpm.Usuarios;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
public class RegistroJpm extends HttpServlet {

    /**
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
        String nom_usuario=request.getParameter("nombre");
        String ape_usuario=request.getParameter("apellido");
        String dir_usuario=request.getParameter("direccion");
        String tel_usuario=request.getParameter("telefono");
        String ced_usuario=request.getParameter("email");
        String pas_usuario=request.getParameter("usuario");
        String user_usuario=request.getParameter("contrasena");
        /*String NOM_EMPRESA=request.getParameter("empresa");
        String RUC_EMPRESA=request.getParameter("ruc");
        String TELF_EMPRESA=request.getParameter("tlf");*/
        Usuarios p= new Usuarios(nom_usuario, ape_usuario, dir_usuario, tel_usuario, ced_usuario, pas_usuario, user_usuario);
        
        p.setPas_usuario(pas_usuario);
        p.setUser_usuario(user_usuario);
        p.setApe_usuario(ape_usuario);
        p.setCed_usuario(ced_usuario);
        p.setDir_usuario(dir_usuario);
        p.setNom_usuario(nom_usuario);
        p.setTel_usuario(tel_usuario);
        
       /* empresa e= new empresa(NOM_EMPRESA, RUC_EMPRESA, TELF_EMPRESA);
        e.setNOM_EMPRESA(NOM_EMPRESA);
        e.setRUC_EMPRESA(RUC_EMPRESA);
        e.setTELF_EMPRESA(TELF_EMPRESA);*/
        
        if(p.insertar()){
            request.getRequestDispatcher("index.jsp").forward(request, response);
            System.out.println("registro realizado correctamente");
        
        }else{
            request.getRequestDispatcher("registro.jsp").forward(request, response);
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
