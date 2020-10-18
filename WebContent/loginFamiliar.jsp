<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!doctype html>
<html lang="pt-br">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>CoronaCare: login</title>
<link rel="stylesheet" type="text/css" href="css/buttons-alter.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
</head>
<body>

	<%
		HttpSession newSession=request.getSession();

		if(session.getAttribute("emailFamiliar") != null){
		response.sendRedirect("RedirecionarPerfilFamiliar");
		}
	%>

	<div id="header">
		<a href="index.jsp"><img class="imagemtop" src="images/CoronaCare.png"  width="100%"></a>
		<p class="headerText">
			<a href="index.jsp" class="title">CoronaCare</a>
		</p>
	</div>

	<div id="body" class="cor">
		<div id="formcadastro">
			<br><br>
			<form action="LoginFamiliar" method="post">
				<label>Email:</label>
				<input id="input-email" type= "text" required="required" name="email" placeholder="email"><br><br>
				<label>Senha:</label>
				<input id="input-senha" type="password" required="required" placeholder="**********" name="password"><br><br>
			
				<div class="inputs">
	    			<div>
	        			<button class="bnt-entrar" type="submit">Entrar</button>
	        		</div>
	    			<div>
	        			<a class="bnt-cadastrar" href="cadastroFamiliar.jsp">Cadastrar</a>
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