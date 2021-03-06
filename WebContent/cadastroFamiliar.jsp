<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html lang="pt-br">

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare: Cadastro</title>

<script src="js/ValidaEmail.js" type="text/javascript"></script>
<script src="js/ValidaSenha.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/buttons-alter.css" >
<link rel="stylesheet" type="text/css" href="css/buttons.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery.mask/1.14.0/jquery.mask.js"></script>
    <script src="js/FormatCamposJQ.js"></script>
    <c:if test="${erro!=null}">
    	<script type="text/javascript">alert("${erro}");</script>
    </c:if>
</head>
<body>
	
	<div id="header">
		<a href="index.jsp"><img class="imagemtop" src="images/CoronaCare.png"  width="100%"></a>
		<p class="headerText">
			<a href="index.jsp">CoronaCare</a>
		</p>
	</div>
	
	<div id="body" class="cor">
		<div id="formcadastro">
			<br><br>
			<form action="RealizarCadastroFamiliar" method="post">
				<label>Nome do Familiar:</label>
				<input type="text" placeholder="Nome" required="required" maxlength="45" size="37" name="nome" autofocus><br><br>
				<label>Data de Nascimento:</label>
				<input type="date" required="required" value="" name="datanascimento"><br><br>
				<label>Telefone:</label>
				<input type="text" id="telefone" required="required" name="telefoneUsuario" placeholder="Telefone" maxlength="15"/><br><br>
				<label>Email:</label>
				<input type="email" required="required" name="emailUsuario" placeholder="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$">
				<label>Confirmar email:</label>
				<input type="email" required="required" name="emailUsuario2" placeholder="email" onblur="ValidaEmail()" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"><br><br>
				<label>Senha:</label>
				<input type="password" required="required" placeholder="password" name="senhaUsuario">
				<label>Confirme a senha:</label>
				<input type="password" required="required" placeholder="password" name="senhaUsuario2" onblur="ValidaSenha()"><br><br>
				<div class="inputs">
	    			<div>
	        			<input class="bnt-entrar" type="submit" value="Cadastrar">
	        		</div>
	    			<div>
	        			<a class="bnt-cadastrar" href="loginPaciente.jsp">Entrar</a>
	        		</div>
				</div>
				
			</form>
	</div>
		</div>

		<div id="footer">
			Para qualquer erro contate (11) 4002-8922
		</div>

	</body>
</html>
