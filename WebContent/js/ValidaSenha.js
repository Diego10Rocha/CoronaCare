function ValidaSenha() {

	var senhaUsuario, senhaUsuario2;
	senhaUsuario = document.forms[0].senhaUsuario.value;
	senhaUsuario2 = document.forms[0].senhaUsuario2.value;

	if (senhaUsuario.length <= 8) {
		alert('A senha está muito curta. Sua senha deve conter entre 8 e 20 caracteres.');
		document.forms[0].senhaUsuario.value = "";
		document.forms[0].senhaUsuario2.value = "";
		document.getElementById('senhaUsuario').focus();
	}

	if (senhaUsuario.length > 20) {
		alert('A senha está muito grande. Sua senha deve conter entre 8 e 20 caracteres.');
		document.forms[0].senhaUsuario.value = "";
		document.forms[0].senhaUsuario2.value = "";
		document.getElementById('senhaUsuario').focus();
	}

	if (!senhaUsuario.match(/(.*[0-9].*[0-9].*[0-9])/)) {
		alert('Sua senha deve conter pelo menos 3 números.');
		document.forms[0].senhaUsuario.value = "";
		document.forms[0].senhaUsuario2.value = "";
		document.getElementById('senhaUsuario').focus();
	}

	if (!senhaUsuario.match(/([a-z].*[A-Z])|([A-Z].*[a-z])/)) {
		alert('Sua senha deve conter letras maiúsculas e minúsculas.');
		document.forms[0].senhaUsuario.value = "";
		document.forms[0].senhaUsuario2.value = "";
		document.getElementById('senhaUsuario').focus();
	}

	if (!senhaUsuario.match(/([!,@,#,$,%,^,&,*,?,_,~])/)) {
		alert('Sua senha deve conter pelo menos um caracter especial. Ex: !,@,#,*');
		document.forms[0].senhaUsuario.value = "";
		document.forms[0].senhaUsuario2.value = "";
		document.getElementById('senhaUsuario').focus();
	}

	if (senhaUsuario != senhaUsuario2) {
		alert('As senhas não correspondem! Digite senhas completamente IGUAIS!');
		document.forms[0].senhaUsuario.value = "";
		document.forms[0].senhaUsuario2.value = "";
		document.getElementById('senhaUsuario').focus();
	}

	if (senhaUsuario === senhaUsuario2) {
		document.formcadastro.submit();
	}
}