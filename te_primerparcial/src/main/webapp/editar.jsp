<%@page import="com.emergentes.modelo.Estudiante"%>
<%
    Estudiante estudiante = (Estudiante) request.getAttribute("miEstudiante");
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
        <h1><%= (estudiante.getId() == 0) ? "Nuevo " : "Editar "%>registro de calificaciones</h1>

        <form action="MainController" method="post">
            <input type="hidden" name="id" value="<%= estudiante.getId()%>">
            <table border="2" cellspacing="0" cellpadding="20">
                <tr>
                    <td>
                        <table>
                            <tr>
                                <td>Nombre del estudiante:</td>
                                <td><input type="text" name="nombre" value="<%= estudiante.getNombres()%>"></td>
                            </tr>
                            <tr>
                                <td>Primer parcial (sobre 30 pts):</td>
                                <td><input type="number" min="0" max="30" name="p1" value="<%= estudiante.getP1()%>"></td>
                            </tr>
                            <tr>
                                <td>Segundo parcial (sobre 30 pts):</td>
                                <td><input type="number" min="0" max="30" name="p2" value="<%= estudiante.getP2()%>"></td>
                            </tr>
                            <tr>
                                <td>Examen final (sobre 40 pts):</td>
                                <td><input type="number" min="0" max="40" name="ef" value="<%= estudiante.getEf()%>"></td>
                            </tr>
                        </table>
                    </td>
                </tr>
            </table><br>
            <input type="submit" value="Enviar">
        </form>
    </center>
</body>
</html>
