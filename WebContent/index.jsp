<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ScientificIn</title>
</head>
<body>
<form method="post" action="../login">
	<fieldset>
		<legend>Faça seu login:</legend>
		<input type="email" name="email" placeholder="E-mail"/>
		<input type="password" name="password" placeholder="Senha"/>
		<input type="submit" value="Entrar!"/>
	</fieldset>
</form>

<form method="post" action="/cadastrar">
	<fieldset>
		<legend>Não possui cadastro? Cadastre-se já!</legend>
		<label>Escolha um e-mail:</label>
		<input type="email" name="email"/>
		
		<label>Escolha uma senha:</label>
		<input type="password" name="password"/>
		
		<label>Confirme a senha escolhida:</label>
		<input type="password" name="confirmation"/>
		
		<input type="submit" value="Cadastrar!"/>
	</fieldset>
</form>
</body>
</html>