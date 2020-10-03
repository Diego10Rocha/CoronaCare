<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare: Cadastro</title>
<link rel="stylesheet" type="text/css" href="css/buttons.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
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
			<form action="RealizarCadastro" method="post">
				<label>Nome do Paciente:</label>
				<input type="text" placeholder="Nome" required="required" maxlength="45" size="37" name="nome"><br><br>
				<label>Data de Nascimento:</label>
				<input type="date" required="required" value="" name="datanascimento"><br><br>
				<label>Telefone:</label>
				<input type="text" required="required" onblur="javascript: formatarCampo(this);" maxlength="14" name="telefone" placeholder="Telefone"/><br><br>
				<label>Email:</label>
				<input type= "text" required="required" name="email" placeholder="email">
				<label>Senha:</label>
				<input type="password" required="required" placeholder="password" name="password"><br><br>
				<input type="submit" value="Cadastrar">
				
			</form>
		</div>
		
	</div>
	
	<div id="footer">
		Para qualquer erro contate (11) 4002-8922
	</div>
</body>
</html>