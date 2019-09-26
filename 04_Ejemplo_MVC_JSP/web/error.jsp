<%-- 
    Document   : error
    Created on : 26-sep-2019, 13:42:20
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error en Registro</title>
    </head>
    <body>
        <h1>Error en Registro</h1>
        Error: <span style="color: red"><%= session.getAttribute("mensajeError") %></span>
    </body>
</html>
