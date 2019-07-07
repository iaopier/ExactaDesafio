<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Página que mostra os gastos</title>
</head>
<body>
	<h1>Gastos</h1>
	<c:if test="${not empty lists}">
		<ul>
			<c:forEach var="listValue" items="${lists}">
				<p><h2><a href="/gasto/${listValue.id}">Gasto ${listValue.id}</a></h2>
			</c:forEach>
		</ul>

	</c:if>
</body>
</html>