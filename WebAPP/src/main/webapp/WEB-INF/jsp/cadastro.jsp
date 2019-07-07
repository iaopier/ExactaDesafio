<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Cadastrar Gastos</h1>
	<form th:object="${model}" th:action="@{/cadastrar}" action="#" method="post">
		Nome da Pessoa : <input type="text" name="nomePessoa"/>
    	Descrição do gasto: <input type="text" name="descricaoGasto">
    	Data/hora: <input type="text" name="dataHora">
    	Valor: <input type="text" name="valorGasto">
    	Tags: <input type="text" name="tagsGasto">
		<input type="submit" value="Submit">
	</form>
</body>
</html>