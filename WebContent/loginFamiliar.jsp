<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare: login</title>
<link rel="stylesheet" type="text/css" href="css/buttons.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
</head>
<body>

	<div id="header">
		<img class="imagemtop" src="images/CoronaCare.png"  width="100%">
		<p class="headerText">
			<a href="index.jsp">CoronaCare</a>
		</p>
	</div>

	<div id="body" class="cor">
		<div id="formcadastro">
			<br><br>
			<form action="RealizarCadastro" method="post">
				<label>Email:</label>
				<input type= "text" required="required" name="email" placeholder="email"><br><br>
				<label>Senha:</label>
				<input type="password" required="required" placeholder="•••••" name="password"><br><br>
				<button type="submit">Entrar</button><br><br>
			</form>
			<a href="cadastroFamiliar.jsp"><button>Cadastre-se</button></a>
			
		</div>
	</div>
	
	<div id="footer">
		Para qualquer erro contate (11) 4002-8922
	</div>

</body>
</html>