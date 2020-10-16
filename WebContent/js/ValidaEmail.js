function ValidaEmail(){
			
	var emailUsuario, emailUsuario2;
	emailUsuario=document.forms[0].emailUsuario.value;
	emailUsuario2=document.forms[0].emailUsuario2.value;
	
	if(emailUsuario != emailUsuario2){
		alert('Os emails não correspondem!');
		document.forms[0].emailUsuario.value="";
		document.forms[0].emailUsuario2.value="";
		document.getElementById('emailUsuario').focus();

	}else if(emailUsuario === emailUsuario2){
		document.formcadastro.submit();
		}
	
	
	
	}