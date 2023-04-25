<%-- 
    Document   : encuExit
    Created on : 28 mar. 2023, 16:19:12
    Author     : Alex Chura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Muchas gracias por llenar nuestra encuesta</h1>
        <p>Los datos recibidos son:</p>
        <ul>
            <li>Nombres: <%= encu.getNombre()%></li>
            <li>Sistema Operativo: 
                <ul>
                    <%
                        for (int i = 0; i < sistOp.length; i++) {
                    %>
                    <li><% out.print(sistOp[i]); %></li>
                        <%
                            }
                        %>
                </ul>
            </li>
        </ul>
    </body>
</html>
