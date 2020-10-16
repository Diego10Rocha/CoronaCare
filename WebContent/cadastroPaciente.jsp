<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare: Cadastro</title>
<<<<<<< HEAD
<<<<<<< HEAD
=======
<script src="js/FormatCamposJQ.js" type="text/javascript"></script>
<script src="js/ValidaEmail.js" type="text/javascript"></script>
<script src="js/ValidaSenha.js" type="text/javascript"></script>
>>>>>>> 266526a8206e8b0bc429ba94413fb34796afbd4b
<link rel="stylesheet" type="text/css" href="css/buttons-alter.css" >
=======
<script src="js/FormatCamposJQ.js" type="text/javascript"></script>
<script src="js/ValidaEmail.js" type="text/javascript"></script>
<script src="js/ValidaSenha.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="css/buttons.css" >
>>>>>>> upstream/master
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
		<div id="formcadastro">
			<br><br>
			<form action="RealizarCadastroPaciente" method="post">
			
				<label>Nome do Paciente:</label>
				<input type="text" placeholder="Nome" required="required" maxlength="45" size="37" name="nome" autofocus><br><br>
				<label>Data de Nascimento:</label>
				<input type="date" required="required" value="" name="datanascimento"><br><br>
				<label>Telefone:</label>
				<input type="text" required="required" maxlength="14" name="telefone" placeholder="Telefone"/><br><br>
				<label>Email:</label>
<<<<<<< HEAD
<<<<<<< HEAD
				<input type= "text" required="required" name="email" placeholder="email"><br><br>
=======
				<input type= "text" required="required" name="emailUsuario" placeholder="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$">
				<label>Confirmar email:</label>
				<input type= "text" required="required" name="emailUsuario2" placeholder="email" onblur="ValidaEmail()" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"><br><br>
>>>>>>> upstream/master
=======
				<input type= "text" required="required" name="emailUsuario" placeholder="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$">
				<label>Confirmar email:</label>
				<input type= "text" required="required" name="emailUsuario2" placeholder="email" onblur="ValidaEmail()" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$"><br><br>
>>>>>>> 266526a8206e8b0bc429ba94413fb34796afbd4b
				<label>Senha:</label>
				<input type="password" required="required" placeholder="password" name="senhaUsuario">
				<label>Confirme a senha:</label>
				<input type="password" required="required" placeholder="password" name="senhaUsuario2" onblur="ValidaSenha()"><br><br>
				<label>Nickname:</label>
				<input type="text" required="required" placeholder="nickname" name="nickname"><br><br>
				<input class="bnt-cadastrar" type="submit" value="Cadastrar">
				
			</form>
		</div>
		
	</div>
	
	<div id="footer">
	Para qualquer erro contate: (xx)9xxxx-xxxx
	</div>

</body>
</html>
