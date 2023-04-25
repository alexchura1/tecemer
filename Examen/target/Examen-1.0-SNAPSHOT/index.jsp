<%-- 
    Document   : index
    Created on : 11 abr. 2023, 21:40:41
    Author     : Alex Chura
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registro de estudiantes</title>
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
	<h1>Registro de estudiantes</h1>
	
	<a href="nuevoEstudiante.jsp">Nuevo</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>ID</th>
				<th>Nombre</th>
				<th>Primer parcial</th>
				<th>Segundo parcial</th>
				<th>Examen final</th>
				<th>Nota</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<!-- Aquí mostraremos la lista de estudiantes -->
		</tbody>
	</table>
	
</body>
</html>
