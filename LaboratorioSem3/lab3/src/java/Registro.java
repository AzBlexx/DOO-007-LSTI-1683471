/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author AzBlexxADM
 */
public class Registro extends HttpServlet {
   
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
        try (PrintWriter out = response.getWriter()) {
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("pass");
            String mail = request.getParameter("mail");
            String mes = request.getParameter("mes");
            String sexo = request.getParameter("vato");
            String mayor = request.getParameter("casilla");
            String acerca = request.getParameter("acerca");
            
            String nusuario = limpiar(usuario);
            String ncontra = limpiar(contra);
            String nmail = limpiar(mail);
            String nacerca = limpiar(acerca);
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Pagina de Respuesta</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<p>Usuario: " + nusuario + " </p>");
            out.println("<p>Contraseña: " + ncontra + " </p>");
            out.println("<p>Correo: " + nmail + " </p>");
            out.println("<p>Mes de nacimiento: " + mes + "</p>");
            out.println("<p>Sexo: " + sexo + "</p>");
            out.println("<p>Acerca:  + " + nacerca + "</p>");
            
            out.println("<a href='index.html'>Registrar</a>");
            out.println("</body>");
            out.println("</html>");
            
        }
    }
    public String limpiar(String cadena){
        try{
             String nuevacadena = java.net.URLEncoder.encode(cadena,"UTF-8");
             return nuevacadena;
        }
        catch(UnsupportedEncodingException e){
            return "Se traba aqui";
        }
       
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
        processRequest(request, response);
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
