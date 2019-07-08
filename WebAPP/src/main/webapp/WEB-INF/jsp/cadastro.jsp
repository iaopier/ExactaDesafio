<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:set var = "date" value = "<%=new java.util.Date(0000-00-00)%>" />
	<h1>Cadastrar Gastos</h1>
	<form th:object="${model}" th:action="@{/cadastrar}" action="#" method="post">
		Nome da Pessoa : <input type="text" name="nomePessoa"/></input>
    	Descrição do gasto: <input type="text" name="descricaoGasto" value=""></input>
    	Data/hora (altere): <input type="text" name="dataHora" value="<fmt:formatDate type="date" 
         value="${date}" pattern="yyyy-MM-dd hh:mm:ss "/>"></input>
    	Valor: <input type="numeric" name="valorGasto"></input>
    	Tags: <input type="text" name="tagsGasto"></input>
		<input type="submit" value="Submit">
	</form>
	<p><a href="/">Voltar para o ínicio</a>
</body>
</html>