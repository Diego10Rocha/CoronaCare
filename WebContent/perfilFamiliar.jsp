<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="Controller.Facade, Dados.Familiar" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare</title>
<script src="js/dynamic-profile.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/buttons.css" >
<link rel="stylesheet" type="text/css" href="css/menu.css" >
<link rel="stylesheet" type="text/css" href="css/componente-perfil.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
</head>
<body>
	<c:if test="${empty emailUsuario}"> response.sendRedirect("RedirecionarLogin");</c:if>
	<div id="header">
		<img class="imagemtop" src="images/CoronaCare.png"  width="100%">
		<p class="headerText">CoronaCare</p>
	</div>
	
	<div id="menu-lateral">
		<p class="menuItem-lateral"><a onClick="enableAddPatientToFamily();">Adicionar Paciente</a></p>
	
		<p class="menuItem-lateral"><a href="loginFamiliar.jsp">Enviar mensagem</a></p>
	</div>
	
	<div id="body-perfil">
		<div id="form-add-patient-to-family">
			<form action="AdicionarPacienteAFamiliar">
				<label>Nickname do Paciente:</label>
				<select name="id_Paciente">
				<c:forEach items="${ListaPacientes}" var="paciente">
				<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
				</c:forEach>
			</select><br>
				<input type="text" required="required" placeholder="nickname" name="nickname">
				<input type="hidden" name="id_Paciente" value="${IdFamiliar}">
				<Button class="bnt-cadastrar" type="submit">Cadastrar</Button>
			</form>
		</div>
	</div>

	
	<div id="footer">
	
	</div>

</body>
</html>