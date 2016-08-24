<#include "/header.ftl">

<div class="jumbotron">
	<div class="container">
		<div class="col-lg-4">
			<a href="#"><img class="center" src="/img/emoji.png" width="50%"/></a>
			  <p><a class="btn btn-primary btn-lg" href="#" style="width: 100%" role="button">Alterar Foto</a></p>
		</div>
		<div class="col-lg-8">
		<#assign showEditName = true>
		
		<form name="updateSci" action="/in/editarPerfilAction" method="post">
			<div class="form-group">
			    <label for="username">Login:</label>
			    <input type="text" class="form-control" id="username" name="username" placeholder="Nome de usuário"/>
			    
			    <label for="password">Senha:</label>
			    <input type="password" class="form-control" id="password" name="password" placeholder="Senha"/>
			    
			    <label for="biografia">Biografia:</label>
			    <textarea class="form-control" name="biografia" id="biografia"></textarea>
			    
			    <label for="nome">Nome:</label>
			    <input type="text" class="form-control" id="nome" name="nome" placeholder="Seu nome"/>
			    
			    <label for="instituicao">Escolha sua instituição:</label>
			    <select class="form-control name="instituicao" id="instituicao">
			    	<#list instituicoes as instituicao>
			    		<option value="${instituicao}">${instituicao.nome}</option>
			    	</#list>
			    </select>
			    
			    <label for="areaDeAtuacao">Escolha sua área de atuação:</label>
			    <select class="form-control name="areaDeAtuacao" id="areaDeAtuacao">
			    	<#list grandesAreas as grandeArea>
			    		<option value="${grandeArea}">${grandeArea.nome}</option>
			    	</#list>
			    </select>
			</div>
			
			<input type="submit" class="btn btn-primary" value="Confirmar"/>
		</form>
		
		<form name="formTrabalho" action="/in/editarPerfil/trabalho" method="post">
			
		</form>
		
		<form name="formConferencia" action="/in/editarPerfil/conferencia" method="post">
			
		</form>
		
		</div>
	</div>
</div>

<script type="text/javascript" src="/js/indexController.js"></script>
<#include "/footer.ftl">
