var validateRegisterForm = function () {
	//Esconde erros.
	$('form[name="cadastro"] div span').hide()
	
	var email = $('form[name="cadastro"] input[name="email"]').val();
	var password = $('form[name="cadastro"] input[name="password"]').val();
	var confirmation = $('form[name="cadastro"] input[name="confirmation"]').val();
	
	var emailRegex = /.+@.+\..+/;
	
	if (email.match(emailRegex) === null && email !== '') {
		$('#registerModal > div > div > div.modal-body > form > div:nth-child(1) > span').show();
		return false;
	}
	
	if (password !== confirmation) {
		$('#registerModal > div > div > div.modal-body > form > div:nth-child(3) > span').show();
		return false;
	}
	
	return true;
}

var registerUser = function () {
	var form = $('form[name="cadastro"]');
	
	if (validateRegisterForm()) {
		form.submit();
	}
}