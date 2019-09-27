<%-- 
    Document   : eliminado
    Created on : 27-sep-2019, 15:36:17
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario Eliminado</title>
    </head>
    <body>
        <h3>El usuarios <%= request.getParameter("nombre")%> se ha eliminado</h3>
        <button><a href="http://localhost:8084/Ejemplo_MVC_JSP/">Inicio</button>
    </body>
</html>
