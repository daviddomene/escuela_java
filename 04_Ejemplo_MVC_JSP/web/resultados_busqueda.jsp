<%-- 
    Document   : resultados_busqueda
    Created on : 26-sep-2019, 15:56:07
    Author     : alumno
--%>

<%@page import="com.sinensia.modelo.Persona"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados busqueda</title>
    </head>
    <body>
        <% Persona p = (Persona) session.getAttribute("resultadoBusqueda"); %>
        <h1>Resultados busqueda</h1>
        <h2>Usuarios</h2>
        <% if(p != null){ %>
        <label for="nombre">Nombre: </label>
        <input readonly value="<%= p.getNombre() %>">
        <label for="edad">Edad: </label>
        <input readonly value="<%= p.getEdad() %>">
        <% }
        else{
        %>
        <p style="color: red;">No se han encontrado resultados</p>
        <% }
        %>
    </body>
</html>
