<%-- 
    Document   : encu
    Created on : 28 mar. 2023, 16:19:00
    Author     : Alex Chura
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Encuesta</title>
    </head>
    <body>
    <center>
        <h1>Encuesta de Sistemas Operativos</h1>
        <form action="EncuestaProcesa" method="POST">
            <table border="0" cellspacing="6" cellpadding="6">
                <tbody>
                    <tr>
                        <td><label>Nombre: </label></td>
                        <td><input type="text" name="nombre"/></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="checkbox" name="sistemaOperativo" id="w" value="Windows">
                            <label for="w">Windows</label>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="checkbox" name="sistemaOperativo" id="l" value="Linux">
                            <label for="l">Linux</label>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="checkbox" name="sistemaOperativo" id="i" value="Ios">
                            <label for="i">Ios</label>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <input type="checkbox" name="sistemaOperativo" id="a" value="Andriod">
                            <label for="a">Android</label>
                        </td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Enviar"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </center>
</body>
