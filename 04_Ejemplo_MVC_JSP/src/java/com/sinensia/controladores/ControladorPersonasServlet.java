/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sinensia.controladores;

import com.sinensia.modelo.Persona;
import com.sinensia.modelo.logica.ServicioPersona;
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
public class ControladorPersonasServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombre = request.getParameter("nombre");
        //String edad = request.getParameter("edad");
        
        Persona p = ServicioPersona.getInstancia().getPersona(nombre);
        request.getSession().setAttribute("resultadoBusqueda", p);
        request.getRequestDispatcher("resultados_busqueda.jsp").forward(request, response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombre");
        String edad = request.getParameter("edad");
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        
        try {
            Persona p = ServicioPersona.getInstancia().addPersonas(nombre, edad, email, pass);
        if (p == null) {
            request.getRequestDispatcher("error.jsp").forward(request, response);
        } else {
            request.getRequestDispatcher("exito.jsp").forward(request, response);
        }
        }
        catch (NumberFormatException ex) {
            request.getSession().setAttribute("mensajeError", "Error numerico" + ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        catch (IllegalArgumentException e) {
            request.getSession().setAttribute("mensajeError", "mensaje error generico: " + e.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }      
        catch (Exception ex){
            request.getSession().setAttribute("mensajeError", "mensaje error generico: " + ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

}
