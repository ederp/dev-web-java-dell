<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"
	import="estoque.*, java.util.Date, java.text.SimpleDateFormat"%>
	
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Estoque de roupas</title>
<link rel="stylesheet" type="text/css" href="CSS/style.css">
</head>
<body>
	<%
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
	String dataFormatada = sdf.format(new java.util.Date());
	%>
	<p id="acesso">
		Acesso a página realizado em
		<%=dataFormatada%></p>
	<table id="roupas">
		<tr>
			<td><b>Tipo</b></td>
			<td><b>Marca</b></td>
			<td><b>Preço</b></td>
			<td><b>Quantidade</b></td>
		</tr>
		<jsp:useBean id="roupasDAO" class="estoque.RoupasDAO" />
		<c:forEach var="item" items="${roupasDAO.listaRoupas}">
			<tr>
				<td>${item.tipo}</td>
				<td>${item.marca}</td>
				<td><fmt:formatNumber value="${item.valor}" pattern="R$ #.00" /></td>
				<td>${item.qtde}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>