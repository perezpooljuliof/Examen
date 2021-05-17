<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
	<head></head>
	<body>
		<h3>Registro de empleado</h3>
		<form:form method="POST" action="/SpringJPAExample/agregaEmpleado" modelAttribute="empleado">
			<table>
				<tr>
					<td>Nombre:</td>
					<td><form:input path="nombre"/></td>
				</tr>
				<tr>
					<td>Edad:</td>
					<td><form:input path="edad"/></td>
				</tr>
				<tr>
					<td>Numero Telefono:</td>
					<td><form:input path="numeroTelefono"/></td>
				</tr>
				<tr><td><input type="submit" value="submit"/></td></tr>
			</table>
		</form:form>
	</body>
</html>