<%-- 
    Document   : exito
    Created on : 26-sep-2019, 13:40:41
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Exito - Registro Guardado</title>
    </head>
    <body>
        <h1>Exito - Registro Guardado</h1>
        <label for="nombre">Nombre: </label>
        <input readonly value="<%= request.getParameter("nombre")%>">
        <label for="edad">Edad: </label>
        <input readonly value="<%= request.getParameter("edad")%>">
        <label for="edad">Email: </label>
        <input readonly value="<%= request.getParameter("email")%>">
        <label for="edad">Password: </label>
        <input readonly value="<%= request.getParameter("pass")%>">
    </body>
</html>
