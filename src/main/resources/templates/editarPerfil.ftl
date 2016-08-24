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





















<div class="container">
	<div class="col-lg-6">
	Alterar Biografia:
<textarea onkeyup="validateRegisterForm();" class="form-control" type="text" name="nome" size ="50"/>
${aluno.biografia}
</textarea>
</div>
<br>
<button id="alterarBiografiaBtn">Alterar</button>



<div class="container">

	<div class="col-lg-12">

<div class="page-header">
  <h3>Artigos</h3>
</div>


<#list aluno.trabalhos as trabalho>
  <p>Trabalho: ${trabalho.titulo}
</#list>

Vrum

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>


<div class="page-header">
  <h3>Livros</h3>
</div>
<div class="testeClass">
		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>
</div>

<div class="page-header">
  <h3>Congressos�ncias</h3>
</div>
		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
		<p>Donec id elit non mi porta gravida at eget metus. Maecenas
			faucibus mollis interdum.</p>

		<p>Morbi leo risus, porta ac consectetur ac, vestibulum at eros.
			Cras mattis consectetur purus sit amet fermentum.</p>

		<p>Maecenas sed diam eget risus varius blandit sit amet non magna.</p>
	</div>

</div>



<!-- <div class="content">

	<div class="col-md-8">
		<nav class="integracoes">
			<a href="#"><img class="icone" src="/img/lattes_icon.png" /></a>
			<a href="#"><img class="icone" src="/img/github_icon.png" /></a>
			<a href="#"><img class="icone"
				src="/img/facebook_icon.svg.png" /></a> <a href="#"><img
				class="icone" src="/img/linkedin_icon.svg.png" /></a>
		</nav>
		
		<div class="options-container">
			<ul class="options col-sm-1 nav nav-pills">
				<li><a class="main-button">Perfil</a></li>
				<li><a class="main-button">Matches</a></li>
				<li><a class="main-button">Meus trabalhos</a></li>
				<li><a class="main-button">Busca de usu�rios</a></li>
			</ul>
		</div>
		
	</div>
	

	<div class="identity col-md-4">
		<h2>Roberto Carlos Top</h2>
		<a href="#"><img class="foto-perfil" src="/img/foto-perfil.jpg" /></a>

		<div id="cloud-home" class="cloud-tag jqcloud"></div>
	</div>

</div> 
 -->
 
 

<script type="text/javascript" src="/js/indexController.js"></script>
<#include "/footer.ftl">
