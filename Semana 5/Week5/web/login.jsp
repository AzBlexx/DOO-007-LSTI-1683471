<%-- 
    Document   : login
    Created on : 21/02/2017, 12:05:19 PM
    Author     : AzBlexxADM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <form action="LoginController">
        Usuario:
        <input type="text" name="username">
        <br>
        Contraseña:
        <input type="password" name="password">
        <br>
        <input type="submit" value="Iniciar sesion">
        </form>
    </body>
</html>
