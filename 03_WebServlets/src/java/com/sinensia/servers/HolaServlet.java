package com.sinensia.servers;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class HolaServlet extends HttpServlet{
    private String propiedad;
    private static int contador;
    
    public HolaServlet(){
        super();
        contador++;
        propiedad = "Valor "+ contador;
    }

    @Override
    protected void doGet(HttpServletRequest peticion, HttpServletResponse respuesta) 
            throws ServletException, IOException {
        
        String ruta = peticion.getContextPath();
        //Tipo de documento de respuesta
        respuesta.setContentType("text/html;charset=UTF-8");
        //Construir HTML de respuesta
        
        try(PrintWriter salida = respuesta.getWriter()){
            salida.println("<html>");
            salida.println("<head>");
            salida.println("<title>");
            salida.println("HTML creado desde Servlevts");
            salida.println("</title>");
            salida.println("</head>");
            salida.println("<boddy>");
            salida.println("<h1>HTML creado desde Servlevts " + propiedad + "</h1>");
            salida.println("<p>Ruta:" + ruta + " </p>");
            salida.println("<ul>");
            for(int i = 0; i < 10; i++){
                salida.println("<li>Numero generado de JAVA " + i +"</li>");
            }
            salida.println("</ul>");
            salida.println("</boddy>");
            salida.println("</html>");
            
        }
    }
    
    
    
}
