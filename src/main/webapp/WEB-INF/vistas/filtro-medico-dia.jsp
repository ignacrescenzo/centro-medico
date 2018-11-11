<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="context" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>

<head>

<meta charset="ISO-8859-1">
<link href="${context}/css/bootstrap.min.css" rel="stylesheet">
<link href="${context}/css/bootstrap-theme.min.css" rel="stylesheet">

<style>
	.container{
		width: 60%;
		margin: 0px auto;
	}
</style>

<title>Elija su especialidad</title>

</head>

<body>
	<div class="container">
		
		<br>
		<button class="btn btn-lg btn-primary btn-block" id="botonMedico">Elegir por Medico</button>
		<br>
		<input type="hidden" value="${especialidadId}" id="especialidadId">
		<button class="btn btn-lg btn-primary btn-block" id="botonDia">Elegir por Dia</button>
		<br>
		<button class="btn btn-lg btn-primary btn-block" id="atras">Atras</button>
		
	</div>
	
	<script src="${context}/js/jquery-3.3.1.min.js"></script>
	<script src="${context}/js/bootstrap.min.js" type="text/javascript"></script>
	<script src="${context}/js/filtro-medico-dia.js" type="text/javascript"></script>
	
</body>

</html>