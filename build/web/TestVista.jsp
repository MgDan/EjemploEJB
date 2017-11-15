<%-- 
    Document   : TestVista
    Created on : 14-nov-2017, 23:45:32
    Author     : DanVz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <jsp:useBean id="t" scope="request" class="ejbs.TestModel" />
        <jsp:setProperty name="t" property="nombre" value="Daniel" />
        <p>El nombre es: <jsp:getProperty name="t" property="nombre" /></p>
        
    </body>
</html>
