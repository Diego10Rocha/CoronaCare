<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="pt-br">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>CoronaCare</title>
<script src="js/dynamic-profile.js" type="text/javascript"></script>
<script src="js/FormatCamposJQ.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/buttons.css">
<link rel="stylesheet" type="text/css" href="css/form.css">
<link rel="stylesheet" type="text/css" href="css/componente-perfil.css">
<link rel="stylesheet" type="text/css" href="css/escopo.css">
<link rel="shortcut icon" href="images/CoronaCare.png"
	type="image/x-icon" />
<style type="text/css">
.imagemlogout {
	position: absolute;
	top: 50%;
	left: 95%;
	height: 40%;
	width: 3%;
}
</style>
</head>
<body>
	<%
		HttpSession newSession = request.getSession();

		if (session.getAttribute("emailFamiliar") == null) {
			response.sendRedirect("RedirecionarLoginFamiliar");
		}
	%>
	<div id="header">
		<img class="imagemtop" src="images/CoronaCare.png" width="100%">
		<p class="headerText">
			<a href="index.jsp">CoronaCare</a>
		</p>
		<a href="ControleLogoutFamiliar"><img class="imagemlogout"
			src="images/logout.png" width="10%"></a>
	</div>

	<div id="body-perfil">
		<div style="text-align: center">
			<h1>Seja bem vindo ao CoronaCare!</h1>
		</div>

		<div id="listView">
			<form action="AdicionarPacienteAFamiliar" method="post">
				<h1>
					<b>Adicionar familiar doente a minha rede:</b>
				</h1>
				<h3>
					<label>Nickname do Paciente:</label>
				</h3>
				<select name="id_Paciente">
					<c:forEach items="${ListaPacientes}" var="paciente">
						<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
					</c:forEach>
				</select><br> <input type="hidden" name="id_Familiar"
					value="${IdFamiliar}">
				<Button class="bnt-cadastrar" type="submit">Cadastrar</Button>
			</form>

		</div>



		<div id="listView">
			<form action="EnviarMensagemTexto" method="post">
				<h1>
					<b>Enviar Mensagem de texto:</b>
				</h1>
				<h3>
					<label>Familiar doente:</label>
				</h3>
				<select name="id_Paciente">
					<c:forEach items="${ListaFamiliarDoente}" var="paciente">
						<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
					</c:forEach>
				</select><br> <br>
				<h3>
					<label>Mensagem:</label>
				</h3>
				<br>
				<textarea name="mensagem" placeholder="Digite uma mensagem..."
					maxlength="1000" required="required"></textarea>
				<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
				<input type="hidden" name="tipo" value="1"><br>
				<Button class="bnt-cadastrar" type="submit">Enviar</Button>
			</form>
		</div>

		<div id="listView">
			<form action="EnviarMensagemTexto" method="post">
				<h1>
					<b>Enviar vídeo do YouTube:</b>
				</h1>
				<h3>
					<label>Familiar doente:</label>
				</h3>
				<select name="id_Paciente">
					<c:forEach items="${ListaFamiliarDoente}" var="paciente">
						<option value="${paciente.getIdUsuario()}">${paciente.getNickname()}</option>
					</c:forEach>
				</select><br> <br>
				<h3>
					<label>Video do YouTube:</label>
				</h3><br>
				<input type="text" style="width: 30%;"
					placeholder="Insira aqui o link do video do YouTube"
					name="mensagem" maxlength="1000" required="required"><br><br>
				<input type="hidden" name="id_Familiar" value="${IdFamiliar}">
				<input type="hidden" name="tipo" value="2">
				<Button class="bnt-cadastrar" type="submit">Enviar</Button>
			</form>
		</div>
	</div>

</body>
</html>
