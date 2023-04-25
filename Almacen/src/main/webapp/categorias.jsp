<%-- 
    Document   : categorias
    Created on : 11 abr. 2023, 23:34:44
    Author     : Alex Chura
--%>
<%@page import="com.emergentes.almacen.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<Categoria> categorias = (ArrayList<Categoria>) session.getAttribute("cates");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Categorias</h1>
        <p><a href="CategoriaController?op=nuevo">Nuevo</p>
        <table border="1">
                <tr>
                    <th></th>
                    <th></th>
                    <th></th>
                    <th></th>
                </tr>
                <%
                    for (Categoria item : categorias){
                %>
                <tr>
                    <td><%= item.getId()%></td>
                    <td><%= item.getDescripcion()%></td>
                    <td><a href="CategoriaController?op=editar&id=<%= item.getId()%>">Editar</td>
                    <td><a href="CategoriaController?op=eliminar&id=<%= item.getId()%>">Eliminar</td>
                </tr>
                <tr>
                    <td></td>
                    <td></td>
                </tr>
        </table>

    </body>
</html>
