<#include "/header.ftl">

<div class="jumbotron">
	<div class="container">
		<div class="col-lg-4">
			<a href="#"><img src="/img/emoji.png" width="50%" alt="Foto de ${sci.nome?split(" ")[0]}"/></a>
		</div>
		<div class="col-lg-8">
		<h2>${sci.nome}</h2>
			<p>${sci.instituicao.nome}</p>
			<p>${sci.areaDeAtuacao.nome}</p>
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Seguir</a></p>
		</div>
	</div>
</div>



<div class="container">
	<div class="col-lg-3">
		<ul class="nav nav-pills nav-stacked">
			<li role="presentation" class="active"><a href="#">Papers</a></li>
			<li role="presentation"><a href="#">Livros</a></li>
			<li role="presentation"><a href="#">Conferências</a></li>
		</ul>
	</div>

	<div class="col-lg-9">

<div class="page-header">
  <h3>Sobre</h3>
</div>
	<p>${sci.biografia}</p>
<div class="page-header">
  <h3>Papers</h3>
</div>
	<#list sci.trabalhos as trabalho>
		<a href="/detalhesTrabalho/${trabalho.id}">${trabalho.nome}</a>
	</#list>

<div class="page-header">
  <h3>Conferências</h3>
</div>
	<#list sci.conferencias as conferencia>
		<a href="${conferencia.url}">Foi ${conferencia.cargo} na conferência ${conferencia.nome} em ${conferencia.data}</a>
	</#list>
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