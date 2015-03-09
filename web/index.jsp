<%--
  Created by IntelliJ IDEA.
  User: fjmontesinos
  Date: 14/2/15
  Time: 8:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Hola Javier</title>
  </head>
  <body>
    <%
    String nombre = "Marcos";
    out.println("¿Quieres que te salude, " + nombre + "? ");
    %>

    <a href="saludar?n=<%=nombre%>">Saludar</a>
  </body>
</html>
