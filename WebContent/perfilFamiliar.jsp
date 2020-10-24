<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="Controller.Facade, Dados.Familiar" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="pt-br">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta http-equiv="X-UA-Compatible" content="ie=edge">
		<title>CoronaCare</title>
		<script src="js/dynamic-profile.js" type="text/javascript"></script>
		<link rel="stylesheet" type="text/css" href="css/buttons.css">
		<link rel="stylesheet" type="text/css" href="css/menu.css">
		<link rel="stylesheet" type="text/css" href="css/componente-perfil.css">
		<link rel="stylesheet" type="text/css" href="css/escopo.css">
		<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon" />
	</head>

	<body>
		<%
			HttpSession newSession=request.getSession();

			if(session.getAttribute("emailFamiliar") == null){
			response.sendRedirect("RedirecionarLoginFamiliar");
			}
		%>
		<div id="header">
			<img class="imagemtop" src="images/CoronaCare.png" width="100%">
			<p class="headerText">CoronaCare</p>
		</div>

		<div id="menu-lateral">
			<p class="menuItem-lateral-add"><a onClick="enableAddPatientToFamily();">➕</a></p>
			<p class="menuItem-lateral-enviar"><a onClick="sendMessage();">📤</a></p>
			<p class="menuItem-lateral-sair"><a href="ControleLogoutFamiliar">❌</a></p>
		</div>

		<div id="body-perfil">
			<div id="form-add-patient-to-family">
				<form action="AdicionarPacienteAFamiliar" method="post">
					<label>Nickname do Paciente:</label>
					<select name="id_Paciente">
						<c:forEach items="${ListaPacientes}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
					</select><br>
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<Button class="bnt-cadastrar" type="submit">Cadastrar</Button>
				</form>
			</div>

			<div id="send-message">
				<form action="EnviarMensagemTexto" method="post">
					<label>Familiar doente:</label>
					<select name="id_Paciente">
						<c:forEach items="${ListaFamiliarDoente}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
					</select>
					<label>Mensagem:</label>
					<input type="text" placeholder="Digite uma mensagem..." name="mensagem" maxlength="1000"><br>
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<input type="hidden" name="tipo" value="1">
					<Button class="bnt-cadastrar" type="submit">Enviar</Button>
				</form>
			</div>

			<div id="send-message">
				<form action="EnviarMensagemTexto" method="post">
					<label>Familiar doente:</label>
					<select name="id_Paciente">
						<c:forEach items="${ListaFamiliarDoente}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
					</select>
					<label>Video do YouTube:</label>
					<input type="text" placeholder="Insira aqui o link do video do YouTube" name="mensagem"
						maxlength="1000"><br>
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<input type="hidden" name="tipo" value="2">
					<Button class="bnt-cadastrar" type="submit">Enviar</Button>
				</form>
			</div>

			<div id="send-message">
				<form action="EnviarMensagemTexto" method="post">
					<label>Familiar doente:</label>
					<select name="id_Paciente">
						<c:forEach items="${ListaFamiliarDoente}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
					</select>
					<label>Multimidia:</label>
					<input type="file" placeholder="Insira aqui o seu arquivo" name="mensagem" maxlength="1000"><br>
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<input type="hidden" name="tipo" value="3">
					<Button class="bnt-cadastrar" type="submit">Enviar</Button>
				</form>
			</div>
		</div>

		<div id="footer"></div>

	</body>

</html>