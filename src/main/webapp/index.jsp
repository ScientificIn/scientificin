<%@ include file="/header.jsp"%>

<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
	data-target="#loginModal">Login</button>

<button type="button" class="btn btn-info btn-lg" data-toggle="modal"
	data-target="#registerModal">Registre-se</button>

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
				<form role="form" method="post" action="/cadastrar">
					<div class="form-group">
						<label for="email">Escolha um e-mail:</label> 
						<input class="form-control" type="email" name="email" />

						<label for="password">Escolha uma senha:</label>
						<input class="form-control" type="password" name="password" /> 
						
						<label for="confirmation">Confirme a senha escolhida:</label> 
						<input class="form-control" type="password" name="confirmation" />
					</div>
				</form>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Cadastre-se!</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
		
	</div>
</div>

<%@ include file="/footer.jsp"%>