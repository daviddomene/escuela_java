/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.servers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alumno
 */
public class ParamServlet extends HttpServlet {

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

        String metodo = request.getMethod();

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ParamServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Introducir datos</h1>");

            //Recogida de datos con el metodo post
            /*if (metodo.equals("GET")) {
                out.println("<form name='form1' method='POST' action='./param'>");
                out.println("<table border='1'>");
                out.println("<tr>");
                out.println("<td>Nombre</td>");
                out.println("<td><input name='nombre' id='nombre' type='text' /></td>");
                out.println("</tr>");
                out.println("<tr>");
                out.println("<td>Edad</td>");
                out.println("<td><input name='edad' id='edad' type='number' /></td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<input type='submit' value='enviar'>");
                out.println("</form>");
            } else if(metodo.equals("POST")) {
                out.println("<p>Te llamas: " + request.getParameter("nombre") + " y tienes " + request.getParameter("edad") + " años</p>");

            }*/
            out.println("<p>Te llamas: " + request.getParameter("nombre") + " y tienes " + request.getParameter("edad") + " años</p>");

            out.println("</body>");
            out.println("</html>");
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
