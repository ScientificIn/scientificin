<%@ include file="/header.jsp"%>

<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
	data-target="#loginModal">Login</button>

<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
	data-target="#registerModal">Registre-se</button>

<div class="container col-sm-6 pull-right">
	<div class="index-video-container col-sm-12">
		<video class="index-video" controls="controls" autoplay="autoplay"
			loop="loop">
			<source src="static/video/blind-remi.mp4" type="video/mp4">
		</video>

	</div>
	
	<a class="logo" href="/about">
		<img src="static/img/logo.png" />
	</a>
</div>

<!-- Modal do Login -->
<div id="loginModal" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Faça login no ScientificIn</h4>
			</div>
			<div class="modal-body">
				<form role="form" method="post" action="/login">
					<div class="form-group">
						<input class="form-control" type="email" name="email" placeholder="E-mail" /> 
						<input class="form-control" type="password" name="password" placeholder="Senha" />
					</div> 
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Login</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
		
	</div>
</div>

<!-- Modal do Cadastro -->
<div id="registerModal" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Faça seu registro no ScientificIn</h4>
			</div>
			<div class="modal-body">
				<form name="cadastro" role="form" method="post" action="/cadastro">
					<div class="form-group">
						<label for="email">Escolha um e-mail:</label>
						<input onkeyup="validateRegisterForm();" class="form-control" type="email" name="email" />
						<span class="help-inline error" style="display:none;">O e-mail digitado não é válido</span>
					</div>

					<div class="form-group">
						<label for="password">Escolha uma senha:</label>
						<input onblur="validateRegisterForm();" class="form-control" type="password" name="password" />
						<span class="help-inline error" style="display:none;">A senha e sua confirmação são diferentes.</span> 
					</div>
					
					<div class="form-group">
						<label for="confirmation">Confirme a senha escolhida:</label> 
						<input onblur="validateRegisterForm();" class="form-control" type="password" name="confirmation" />
						<span class="help-inline" style="display:none;">A senha e sua confirmação são diferentes.</span>
					</div>
					
					<div class="form-group">
						<label for="instituicao">Sua instituição de ensino:</label> 
						<input onkeyup="validateRegisterForm();" class="form-control" type="text" name="instituicao" />
						<span class="help-inline" style="display:none;"></span>
					</div>
					
					<div class="form-group">
						<label for="area">Sua área de atuação:</label> 
						<input onkeyup="validateRegisterForm();" class="form-control" type="text" name="area" />
						<span class="help-inline" style="display:none;"></span>
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" onclick="registerUser()">Cadastre-se!</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
		
	</div>
</div>

<%@ include file="/footer.jsp"%>