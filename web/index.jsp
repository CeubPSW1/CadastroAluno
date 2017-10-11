<%-- 
    Document   : index
    Created on : 11/10/2017, 20:13:09
    Author     : Alexandre.Torres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
    </head>
    <body>
        <form action="Controller">
            <div class="form-group">
                <label for="">RA</label>
                <input type="text" name="ra">
                <label for="">Nome</label>
                <input type="text" name="nome">
                <input type="submit" class="btn btn-primary" value="Incluir">
            </div>
        </form>
    </body>
</html>
