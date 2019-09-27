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
        <% Persona p = (Persona) session.getAttribute("resultadoBusqueda");%>

        <h2>Actualizar personas</h2>
        <form name='form4' method='POST' action='personas.do'>
            <table border='1'> 
                <tr> 
                    <td>Nombre</td> 
                    <td><input name='nombre' value="<%= p.getNombre()%>" id='nombre' type='text' /></td>
                </tr> 
                <tr> 
                    <td>Edad</td> 
                    <td><input name='edad' id='edad' value="<%= p.getEdad()%>" type='number' /></td> 
                </tr>
                <td>Email</td> 
                <td><input name='email' id='email' value="<%= p.getEmail()%>" typee='text' /></td> 
                </tr>
                <tr> 
                    <td>pass</td> 
                    <td><input name='pass' id='pass' value="<%= p.getPass()%>" type='pass' /></td>
                </tr>
            </table> 
            <input type="submit" id="borrar" value="delete">
            <input type="submit" id="actualizar" value="update">
            <input type="hidden" id="metodo" name="metodo" value="algo">

        </form>

        <script>

            document.getElementById("borrar").addEventListener('click', borrar);
            document.getElementById("actualizar").addEventListener('click', actualizar);
            var p = document.getElementById("metodo");
            function borrar() {
                p.value = "delete";
            }
            function actualizar() {
                p.value = "update";
            }


        </script>

    </body>
</html>
