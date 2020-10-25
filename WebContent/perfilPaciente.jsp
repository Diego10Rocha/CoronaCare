<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!doctype html>
<html lang="pt-br">
<head>
<meta charset="utf-8">
<title>CoronaCare</title>
<link rel="stylesheet" type="text/css" href="css/perfilPaciente.css">
<link rel="shortcut icon" href="images/CoronaCare.png"
	type="image/x-icon" />
<script src="js/dynamic-profile.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/buttons.css">
<link rel="stylesheet" type="text/css" href="css/menu.css">
<link rel="stylesheet" type="text/css" href="css/componente-perfil.css">
<link rel="stylesheet" type="text/css" href="css/escopo.css">

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

		if (session.getAttribute("emailPaciente") == null) {
			response.sendRedirect("RedirecionarLoginPaciente");
		}
		System.out.println(session.getAttribute("emailPaciente"));
	%>

	<div id="header">
		<img class="imagemtop" src="images/CoronaCare.png" width="100%">
		<p class="headerText">
			<a href="index.jsp">CoronaCare</a>
		</p>
		<a href="ControleLogoutPaciente"><img class="imagemlogout"
			src="images/logout.png" width="10%"></a>
	</div>

	<div id="body-perfil">

		<c:forEach items="${ListaMensagens}" var="message">
			<div id="listView">
				<h1>
					<b>${message.getNomeFamiliar() }</b>
				</h1>
				<br>
				<c:if test="${message.getTipo()==1}">
					<h1>${message.getMensagem() }</h1>
					<br>
				</c:if>

				<c:if test="${message.getTipo()==2}">
					<iframe width="560" height="315" src="${message.getMensagem()}"
						frameborder="0"
						allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture"
						allowfullscreen></iframe>
				</c:if>
				<br>
			</div>
		</c:forEach>
		<br>

	</div>


</body>
</html>
