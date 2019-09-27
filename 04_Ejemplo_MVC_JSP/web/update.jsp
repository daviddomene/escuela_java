<%-- 
    Document   : elimar
    Created on : 26-sep-2019, 17:21:20
    Author     : alumno
--%>

<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <% Persona p = (Persona) session.getAttribute("resultadoBusqueda"); %>
        <h1>Modificar</h1>
        <h2>Modificar usuarios</h2>
        <% if(p != null){ %>
        <label for="nombre">Nombre: </label>
        <input value="<%= p.getNombre() %>">
        <label for="edad">Edad: </label>
        <input value="<%= p.getEdad() %>">
        <label email="email">Email </label>
        <input value="<%= p.getEmail() %>">
        <label type="pass">Pass: </label>
        <input value="<%= p.getPass() %>">
        <% }
        else{
        %>
        <p style="color: red;">No se han encontrado resultados</p>
        <% }
        %>
    </body>
</html>
