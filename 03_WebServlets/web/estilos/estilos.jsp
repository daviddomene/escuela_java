<%-- 
    Document   : estilos
    Created on : 26-sep-2019, 9:29:55
    Author     : alumno
--%>

<%@page contentType="text/css" pageEncoding="UTF-8"%>
.menu-principal {
    display: inline-block;
    border: 1px solid green;
    margin: 3px;
}
.colorAnoMa{
    color: red;
}
.colorAnoMe{
    color: green;
}

<% for (int i = 0; i < 10; i++) {%>

.tipo-letra-<%="tam-" + i %>{
    font-size: <%=10 + i * 2 %>px;
    background-color: #4444<%=i * 10%>;
}

<%}%>
