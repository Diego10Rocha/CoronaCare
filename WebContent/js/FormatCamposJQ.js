//Máscara Telefone
(function( $ ) {
  $(function() {
	  $("#telefone").mask("(99) 99999-9999");  });
})(jQuery);

//bloquear a tecla enter no textarea
$(document).ready(function () {
	   $('textarea').keypress(function (e) {
	        var code = null;
	        code = (e.keyCode ? e.keyCode : e.which);                
	        return (code == 13) ? false : true;
	   });
	});
