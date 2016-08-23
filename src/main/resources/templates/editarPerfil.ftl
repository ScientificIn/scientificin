<#include "/header.ftl">

<div class="jumbotron">
	<div class="container">
		<div class="col-lg-4">
			<a href="#"><img class="center" src="/img/emoji.png" width="50%"/></a>
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Alterar Foto</a></p>
		</div>
		<div class="col-lg-8">
		<#assign showEditName = true>

<h2>${aluno.nome}</h2>
<div id="alterarNomeDiv" style="display:none;">
				<form name="alterar" role="form" method="post" action="/alterar">
					<div class="form-group" >
						<label for="nome">Qual seu nome?</label>
						<input onkeyup="validateRegisterForm();" class="form-control" type="text" name="nome" />
						<span class="help-inline error" style="display:none;">Seu nome deve ter no máximo 100 letras. Você pode abreviar os nomes do meio.</span>
					</div>
				</form>
</div>
<button id="alterarNomeBtn">Alterar</button>
		
<p>${aluno.instituicao.nome} (${aluno.instituicao.sigla})</p>
<div id="alterarIESDiv" style="display:none;">
				<form name="alterar" role="form" method="post" action="/alterar">
					<div class="form-group" >
						<label for="instituicao">Sua instituição de ensino:</label>
						<select class="form-control" name="instituicao">
							<#list instituicoes?sort_by("nome") as inst>
							<option value="${inst.id}">${inst.nome}</option>
							</#list>
						</select> 
					</div>
				</form>
</div>
<button id="alterarIESBtn">Alterar</button>



      <#-- <p>Centro de Matem�tica, Computa��o e Cogni��o</p> -->
			<p>${aluno.areaDeAtuacao.nome}</p>
			
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
 
 
 
 <#include "/footer.ftl">
