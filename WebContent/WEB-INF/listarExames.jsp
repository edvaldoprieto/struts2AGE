<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Listar Exames</title>
</head>
<body>

<h3>Lista de exames</h3>
	<table>
	<tr>
	<td>Código</td>
	<td>Exame</td>
	</tr>
	<c:forEach items="$exames" var="exame">
	<tr>
	<td>${exame.idExame}</td>
	<td>${exame.nomeExame}</td>
	</tr>	
	</c:forEach>
	</table>
	<br>
	<h5><a href="novo">Novo</a></h5>
	

</body>
</html>