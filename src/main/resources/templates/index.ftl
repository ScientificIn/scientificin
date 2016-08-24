<#include "/header.ftl">

  <div class="content">
    <h1>Bem-vindo a scientificIn</h1>
    <p>Versão Alfa0.1 da index do site do projeto!.</p>
    
	<a data-toggle="modal" href="#modalCadastro">Cadastre-se!</a>     
    <br><br> 
    <p>Já possui conta?</p>     
    <a data-toggle="modal" href="#modalLogin">Entre!</a> 
  </div>
  
  
<!--<video id="video" class="video" autoplay muted loop>-->
  <video id="video" class="video" autoplay loop>
    <source src="/video/blind-remi.mp4" type="video/mp4">
  </video>
  
<!-- Modal do Login -->
<div id="modalLogin" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Faça login no ScientificIn</h4>
			</div>
			<div class="modal-body">
				<form role="form" method="post" id="login" action="/login">
					<div class="form-group">
						<input class="form-control" type="text" name="username" placeholder="E-mail" /> 
						<input class="form-control" type="password" name="password" placeholder="Senha" />
					</div> 
				</form>
			</div>
			<div class="modal-footer">
				<input type="submit" form="login" class="btn btn-default" value="Login"/>
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			</div>
		</div>
		
	</div>
</div>

<!-- Modal do Cadastro -->
<div id="modalCadastro" class="modal fade" role="dialog">
	<div class="modal-dialog">

		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Faça seu registro no ScientificIn</h4>
			</div>
			<div class="modal-body">
				<form name="cadastro" role="form" method="post" action="/cadastro">
					<div class="form-group">
						<label for="nome">Qual seu nome?</label>
						<input onkeyup="validateRegisterForm();" class="form-control" type="text" name="nome" />
						<span class="help-inline error" style="display:none;">Seu nome deve ter no máximo 100 letras. Você pode abreviar os nomes do meio.</span>
					</div>
					
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
						<select class="form-control" name="instituicao">
							<#list instituicoes?sort_by("nome") as inst>
							<option value="${inst.id}">${inst.nome}</option>
							</#list>
						</select> 
					</div>
					
					<div class="form-group">
						<label for="areaDeAtuacao">Sua área de atuação:</label>
						<select class="form-control" name="areaDeAtuacao">
							<#list grandesAreas?sort_by("nome") as ga>
							<option value="${ga.id}">${ga.nome}</option>
							</#list>
						</select>  
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

<script type="text/javascript" src="/js/indexController.js"></script>
<#include "/footer.ftl">