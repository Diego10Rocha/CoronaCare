<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CoronaCare</title>
<!-- 
<link rel="stylesheet" type="text/css" href="css/menu.css" >
<link rel="stylesheet" type="text/css" href="css/escopo.css" >
<link rel="shortcut icon" href="images/CoronaCare.png" type="image/x-icon"/>
 -->
<style type="text/css">

#header{
	position: absolute;
	top: 0px;
	left: 0px;
	width: 100%;
	height: 15%;
	background: #B22222;
	<!-- background: #139bec; -->
	font-size: 20px;
}
#body{
	position: absolute;
	top: 15%;
	left: 0%;
	height: 85%;
	width: 100%;
	background-color: #ffffff;
}

#menu{
	position:absolute;
	top:20%;
	left:25%;
	height:20%;
	background-color: silver;
	width:45%;
	opacity:0.9;
	border-radius: 50px 50px 50px 50px;
	text-align:center;
}		
		
#formcadastro{
	position:absolute;
	top:15%;
	left:35%;
	background-color:white;
	width:65%;
}		
	
#footer{
	position: absolute;
	top:100%;
	left:0%;
	height:10%;
	background-color: silver;
	width:100%;
	text-align:center;
}

.headerText {
	color: white;
	font-family:"ar blanca";
	text-align:center;
	font-weight:bold;
	font-size: 40;
}

.imagemtop{
	position: absolute;
	top: 1%;
	left:1%;	
	height: 98%;
	width: 13%;
}



a{
	text-decoration: none;
	cursor: pointer;
	color: white;
	font-weight:bold;
	font-family: "arial";
}
.menuItem{
	margin:10%;
	padding: 10px;
	text-align: center;
	border-radius: 10px 10px 10px 10px;
	background-color: #B22222;
	FONT-SIZE: 25;
	font-family: "arial";
	opacity: 0.85;
}
.menuItem:hover{
	color: white;
	FONT-SIZE: 30;
	opacity: 1;
}
		
#paciente{
	position: absolute;
	left: 0%;
	width: 50%;
}

#familiar{
	position: absolute;
	left: 50%;
	width: 50%
}

</style>
</head>
<body>
<div id="header">
	<img class="imagemtop" src="images/CoronaCare.png"  width="100%">
	<p class="headerText">CoronaCare</p>
</div>
<div id="body">
	<div id="menu">
		<div id="paciente">
			<a href="loginPaciente.jsp"><p class="menuItem">Entrar Como Paciente </p></a>
		</div>
		<div id="familiar">
			<a href="loginFamiliar.jsp"><p class="menuItem">Entrar Como Familiar </p></a>
		</div>
	</div>
	<!--<iframe width="853" height="480" src="https://www.youtube.com/embed/OpM2T2QYeX4" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe> -->
</div>

<div id="footer">Para qualquer erro contate DH - Development</div>
</body>
</html>