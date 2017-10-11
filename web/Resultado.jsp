<%-- 
    Document   : Resultado
    Created on : 11/10/2017, 20:24:46
    Author     : Alexandre.Torres
--%>

<%@page import="model.Aluno"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Aluno aluno = (Aluno)request.getAttribute("aluno");
        %>
        <p>Nome <%= aluno.getNome()  %></p>
        <p>RA <%= aluno.getRa()%></p>
    </body>
</html>
