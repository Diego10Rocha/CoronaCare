<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@page import="Controller.Facade, Dados.Familiar" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="pt-br">
<<<<<<< HEAD
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
	<title>CoronaCare</title>
	<script src="js/dynamic-profile.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="css/buttons.css" >
	<link rel="stylesheet" type="text/css" href="css/menu.css" >
	<link rel="stylesheet" type="text/css" href="css/componente-perfil.css" >
	<link rel="stylesheet" type="text/css" href="css/escopo.css" >
	<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
	
</head>
<body>
	<%
		HttpSession newSession=request.getSession();

		if(session.getAttribute("emailFamiliar") == null){
		response.sendRedirect("RedirecionarLoginFamiliar");
		}
	%>
	<div id="header">
		<img class="imagemtop" src="images/CoronaCare.png"  width="100%">
		<p class="headerText"><a href="index.jsp">CoronaCare</a></p>
		<a href="ControleLogoutPaciente"><img class="imagemlogout" src="images/logout.png"  width="10%"></a>
	</div>
	
	<div id="body-perfil">
		<div style="text-align:center">
			<h1>Seja bem vindo ao CoronaCare! </h1>
		</div>
		<div id="form-add-patient-to-family">
			<div id="listView">
				<form action="AdicionarPacienteAFamiliar" method="post">
					<h1><b>Adicionar familiar doente a minha rede:</b></h1>
					<h3 ><label>Nickname do Paciente:</label></h3>
					<select name="id_Paciente">
						<c:forEach items="${ListaPacientes}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
					</select><br>
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<Button class="bnt-cadastrar" type="submit">Cadastrar</Button>
				</form>
			</div>
		</div>
		
		<div id="send-message">
			<div id="listView">
				<form action="EnviarMensagemTexto" method="post">
					<h1><b>Enviar Mensagem de texto:</b></h1>
					<h3><label>Familiar doente:</label></h3>
=======

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
>>>>>>> 35513721611dcae986f4c04fed75ca55ea00a275
					<select name="id_Paciente">
						<c:forEach items="${ListaFamiliarDoente}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
<<<<<<< HEAD
					</select><br><br>
					<h3><label>Mensagem:</label></h3>
=======
					</select>
					<label>Mensagem:</label>
>>>>>>> 35513721611dcae986f4c04fed75ca55ea00a275
					<input type="text" placeholder="Digite uma mensagem..." name="mensagem" maxlength="1000"><br>
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<input type="hidden" name="tipo" value="1">
					<Button class="bnt-cadastrar" type="submit">Enviar</Button>
				</form>
			</div>
<<<<<<< HEAD
			
			<div id="listView">
				<form action="EnviarMensagemTexto" method="post">
					<h1><b>Enviar vídeo do YouTube:</b></h1>
					<h3><label>Familiar doente:</label></h3>
=======

			<div id="send-message">
				<form action="EnviarMensagemTexto" method="post">
					<label>Familiar doente:</label>
>>>>>>> 35513721611dcae986f4c04fed75ca55ea00a275
					<select name="id_Paciente">
						<c:forEach items="${ListaFamiliarDoente}" var="paciente">
							<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
						</c:forEach>
<<<<<<< HEAD
					</select><br><br>
					<h3><label>Video do YouTube:</label></h3>
					<input type="text" placeholder="Insira aqui o link do video do YouTube" name="mensagem" maxlength="1000"><br>
=======
					</select>
					<label>Video do YouTube:</label>
					<input type="text" placeholder="Insira aqui o link do video do YouTube" name="mensagem"
						maxlength="1000"><br>
>>>>>>> 35513721611dcae986f4c04fed75ca55ea00a275
					<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
					<input type="hidden" name="tipo" value="2">
					<Button class="bnt-cadastrar" type="submit">Enviar</Button>
				</form>
			</div>
<<<<<<< HEAD
			
=======

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
>>>>>>> 35513721611dcae986f4c04fed75ca55ea00a275
		</div>

<<<<<<< HEAD
=======
		<div id="footer"></div>
>>>>>>> 35513721611dcae986f4c04fed75ca55ea00a275

	</body>
</html>
