<%-- 
    Document   : nuevoEstudiante
    Created on : 11 abr. 2023, 21:50:03
    Author     : Alex Chura
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Nuevo estudiante</title>
        <style>
		.box {
			margin: auto;
			width: 50%;
			padding: 10px;
			border: 1px solid #ccc;
			text-align: center;
		}
	</style>
</head>
<body>
        <div class="box">
                <h3>PRIMER PARCIAL TEM-742</h3>
                <p>Nombre: Luis Alex Chura Quispe</p>
                <p>Carnet: 9246232</p>
	</div>
	<h1>Nuevo estudiante</h1>
	
	<form method="post" action="NuevoEstudianteServlet">
		<label for="nombre">Nombre:</label>
		<input type="text" id="nombre" name="nombre" required><br>
		
		<label for="parcial1">Nota primer parcial:</label>
		<input type="number" id="parcial1" name="parcial1" min="0" max="100" required><br>
		
		<label for="parcial2">Nota segundo parcial:</label>
		<input type="number" id="parcial2" name="parcial2" min="0" max="100" required><br>
		
		<label for="finalExamen">Nota examen final:</label>
		<input type="number" id="finalExamen" name="finalExamen" min="0" max="100" required><br>
		
		<input type="submit" value="Guardar">
	</form>
	
	<a href="index.jsp">Cancelar</a>
	
</body>
</html>
