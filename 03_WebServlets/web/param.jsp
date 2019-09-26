<%-- 
    Document   : param
    Created on : 25-sep-2019, 17:36:52
    Author     : alumno
--%>

<%@include file="head.jsp"%>
<!DOCTYPE html>
<html>
    <%= head("Param") %>
    <body>
        <%@include file="header.jsp" %>
        <h1>Datos</h1>

        <p>Te llamas <% out.println(request.getParameter("nombre")); %> y tienes <% out.println(request.getParameter("edad")); %> años</p>
        <p>Tu email es: <% out.println(request.getParameter("email")); %> </p>
        <p>Tu password es: <% out.println(request.getParameter("pass")); %> </p>
        <ul>
            <%
                int edad = Integer.parseInt(request.getParameter("edad"));

            %>
            <% for (int i = 0; i < 10; i++) {
                    if (edad < 18) {

            %>

            <li class="tipo-letra-tam-<%= i%> , colorAnoMe">Numero: <% out.println("" + i); %></li>

            <% } else {%>
            <li class="tipo-letra-tam-<%= i%> , colorAnoMa">Numero: <% out.println("" + i); %></li>
                <%}

    }%>
        </ul>
    </body>
</html>
