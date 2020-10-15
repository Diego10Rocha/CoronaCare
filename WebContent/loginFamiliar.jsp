<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare: login</title>
<link rel="stylesheet" type="text/css" href="css/buttons-alter.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
</head>
<body>

	<div id="header">
		<img class="imagemtop" src="images/CoronaCare.png"  width="100%">
		<p class="headerText">
			<a href="index.jsp" class="title">CoronaCare</a>
		</p>
	</div>

	<div id="body" class="cor">
		<div id="formEntrar">
			<br><br>
			<form action="RealizarCadastro" method="post">
				<label>Email:</label>
				<input id="input-email" type= "text" required="required" name="email" placeholder="email"><br><br>
				<label>Senha:</label>
				<input id="input-senha" type="password" required="required" placeholder="**********" name="password"><br><br>
			</form>
		</div>
		<div class="inputs">
    			<div>
        			<button class="bnt-entrar" type="submit">Entrar</button></div>
    			<div>
        			<a class="bnt-cadastrar" href="cadastroFamiliar.jsp">Cadastrar</a></div>
		</div>
		
	</div>
	
	<div id="footer">
		Para qualquer erro contate (11) 4002-8922
	</div>
</body>
</html>