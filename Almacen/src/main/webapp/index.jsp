<%-- 
    Document   : index
    Created on : 11 abr. 2023, 23:24:41
    Author     : Alex Chura
--%>

<%@page import="com.emergentes.almacen.Categoria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.emergentes.almacen.Producto"%>
<%
if(session.getAttribute("almacen")==null){
    ArrayList<Producto> lisaux = new ArrayList<Producto>();
    session.setAttribute("almacen",lisaux);
}
if(session.getAttribute("cates")==null){
    ArrayList<Categoria> liscat = new ArrayList<Categoria>();
    
    liscat.add(new Categoria(1,"Bebidas"));
    liscat.add(new Categoria(2,"Galletas"));
    liscat.add(new Categoria(3,"Golosinas"));
    session.setAttribute("cates", liscat);
}
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Almcen</h1>
        <ul>
            <li><a href="productos.jsp">Productos</li>
            <li><a href="categorias.jsp">Categorias</li>
        </ul>
    </body>
</html>
