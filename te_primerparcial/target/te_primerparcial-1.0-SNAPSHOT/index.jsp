<%@page import="com.emergentes.modelo.Estudiante"%>
<%@page import="java.util.ArrayList"%>
<%
    ArrayList<Estudiante> lista = (ArrayList<Estudiante>) session.getAttribute("listaest");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <table border="2" cellspacing="0" cellpadding="20">
            <tr>
                <td>
                    PRIMER PARCIAL TEM-742<br>
                    Nombre: Maximo Baldomero Yujra Calla<br>
                    Carnet: 9879538
                </td>
            </tr>
        </table>
        <h1>Registro de calificaciones</h1>
    </center>
    <a href="MainController?op=nuevo">Nuevo</a><br><br>
    <table border="2" cellspacing="0" cellpadding="6">
        <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>P1(30)</th>
                <th>P2(30)</th>
                <th>EF(40)</th>
                <th>Nota</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            <%
                if (lista != null) {
                    for (Estudiante item : lista) {
            %>
            <tr>
                <td><%= item.getId()%></td>
                <td><%= item.getNombres()%></td>
                <td><%= item.getP1()%></td>
                <td><%= item.getP2()%></td>
                <td><%= item.getEf()%></td>
                <td><%= item.getNota()%></td>
                <td><a href="MainController?op=editar&id=<%= item.getId()%>">Editar</a></td>
                <td><a href="MainController?op=eliminar&id=<%= item.getId()%>" onclick='return confirm("Esta seguro de eliminar el registro ?");'>Eliminar</a></td>
            </tr>
            <%
                    }
                }
            %>
        </tbody>
    </table>
</body>
</html>
