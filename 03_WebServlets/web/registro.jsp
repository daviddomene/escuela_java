<%-- 
    Document   : registro
    Created on : 26-sep-2019, 10:23:29
    Author     : alumno
--%>
<%@include file="head.jsp"%>
<!DOCTYPE html>
<html>
    <%= head("Formulario") %>
    <body>
        <%@include file="header.jsp" %>
        <div>TODO write content</div>
        <form name='form1' method='POST' action='./param.jsp'>
            <table border='1'> 
                <tr> 
                    <td>Nombre</td> 
                    <td><input name='nombre' id='nombre' type='text' /></td> 
                </tr> 
                <tr> 
                    <td>Edad</td> 
                    <td><input name='edad' id='edad' type='number' required="required" /></td> 
                </tr>
                <tr> 
                    <td>Email</td> 
                    <td><input name='email' id='email' type='email' /></td> 
                </tr> 
                <tr> 
                    <td>Contraseña</td> 
                    <td><input name='pass' id='pass' type='password' /></td> 
                </tr> 
            </table> 
            <input type='submit' value='enviar'> 
        </form>
    </body>
</html>
