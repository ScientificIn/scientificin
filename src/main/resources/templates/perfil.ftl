<#include "/header.ftl">

<div class="jumbotron">
	<div class="container">
		<div class="col-lg-4">
			<a href="#"><img class="center" src="/img/emoji.png" width="50%"/></a>
		</div>
		<div class="col-lg-8">

		<h2>${Session.sci.nome}</h2>
			<p>${Session.sci.instituicao.nome} (${Session.sci.instituicao.sigla})</p>

      <#-- <p>Centro de Matem�tica, Computa��o e Cogni��o</p> -->
			<p>${Session.sci.areaDeAtuacao.nome}</p>
			
			  <p><a class="btn btn-primary btn-lg" href="#" role="button">Seguir</a></p>
		</div>
	</div>
</div>

<div class="container">
	<div class="col-lg-6">
	Sobre ${Session.sci.nome}:

      ${Session.sci.biografia}
      <#-- ${Session.sci.biografia} -->

	</div>
	<div class="col-lg-6">
	Nuvem de tags
	</div>
</div>

<div class="container matcherBox">
	<div class="col-lg-6">
	<b>Matcher</b>
	${Session.sci.nome} procura:
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
		  <h3>Trabalhos</h3>
		</div>
		<div class="panel-group" id="accordion" role="tablist" aria-multiselectable="true">
			<#list sci.trabalhos as trabalho>
				<div class="panel panel-default">
					<div class="panel-heading" role="tab" id="head-${trabalho.id}">
						<h4 class="panel-title">
						<a role="button" data-toggle="collapse" data-parent="#accordion" href="#trabalho-${trabalho.id}" aria-expanded="true" aria-controls="collapseTrabalho${trabalho.id}">
							${trabalho.titulo}
						</a>
						</h4>
					</div>
					<div id="trabalho-${trabalho.id}" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingOne">
						<div class="panel-body">
							${trabalho.notasDoAutor}<br><br>
							Posição no Ranking Geral: ${trabalho.posicao}<br>
							Posição no Ranking da Área: ${trabalho.posicaoNaArea}<br>
							Posição no Ranking da Sub-Área: ${trabalho.posicaoNaSubArea}<br><br>
							<a href="/in/trabalho/${trabalho.id}">Detalhes</a>
						</div>
					</div>
				</div>
			</#list>
		</div>
	  
		<div class="page-header">
		  <h3>Conferências</h3>
		</div>
		
		<#list sci.conferencias as conferencia>
			<div class="panel panel-default">
			  <div class="panel-body">
			    <a href="${conferencia.url}">${conferencia.nome}</a>
			  </div>
			  <div class="panel-footer">${conferencia.data}, foi ${conferencia.cargo}</div>
			</div>
		</#list>
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
				<li><a class="main-button">Busca de usuários</a></li>
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
