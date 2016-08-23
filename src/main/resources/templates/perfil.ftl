<#include "/header.ftl">

<div class="jumbotron">
	<div class="container">
		<div class="col-lg-4">
			<a href="#"><img class="center" src="/img/emoji.png" width="50%"/></a>
		</div>
		<div class="col-lg-8">

		<h2>${aluno.nome}</h2>
			<p>${aluno.instituicao.nome} (${aluno.instituicao.sigla})</p>

      <#-- <p>Centro de Matem�tica, Computa��o e Cogni��o</p> -->
			<p>${aluno.areaDeAtuacao.nome}</p>
			
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Seguir</a></p>
		</div>
	</div>
</div>

<div class="container">
	<div class="col-lg-6">
	Sobre Roberto Carlos:

      ${aluno.biografia}
      <#-- ${aluno.biografia} -->

	</div>
	<div class="col-lg-6">
	Nuvem de tags
	</div>
</div>

<div class="container matcherBox">
	<div class="col-lg-6">
	<b>Matcher</b>
	Roberto Carlos procura:
	<ul>
	<li>
	O cara que pensa em você toda hora
	</li>
	<li>
	Que conta os segundos se você demora
	</li>
	<li>
	Que está todo o tempo querendo te ver
	</li>
	</ul>
	</div>

	<div class="col-lg-6">
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Quero</a></p>
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Indicar alguém</a></p>
	</div>
</div>


<div class="container">

	<div class="col-lg-12">

<div class="page-header">
  <h3>Artigos</h3>
</div>

<#list aluno.trabalhos as trabalho>
  <p>Trabalho: ${trabalho.titulo}
</#list>


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
