<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Tareas - Inicio</title>
</head>
<body>
	<h1>Bienvenido a la gestión de tareas</h1>
	<form action="TaskController" method="POST">
		<label for="taskName">Nombre de tarea:</label>
		<input type="text" name="taskName" id="taskName" required>
		<button type="submit">Agregar tarea</button>
		<input type="hidden" name="action" value="add">
	</form>
	<h2>Tareas pendientes:</h2>
	<ul>
		<c:forEach var="task" items="${tasks}">
			<li>${task.name} <a href="TaskController?action=delete&id=${task.id}">Eliminar</a></li>
		</c:forEach>
	</ul>
</body>
</html>
