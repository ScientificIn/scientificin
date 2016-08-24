<#include "/header.ftl">

<div class="container homeFirstBox">

			<h2>Olá, <span style="font-weight: bold;">${Session.sci.nome}</span>, navegue em uma das opções:</h2>
			
			<div class="col-lg-6">
			  <p><a class="btn btn-primary btn-lg" href="/in/perfil" role="button">Visualizar perfil</a></p>
			</div>

			<div class="col-lg-6">
			  <p><a class="btn btn-primary btn-lg" href="/in/match" role="button">Usar matcher</a></p>
			</div>

</div>

<div class="container homeFirstBox">

			<div class="panel panel-default col-md-6">
			  <div class="panel-heading">Últimas conferências</div>
			  <div class="panel-body">
			  	<#if Session.sci.conferencias??>
				  	<#list Session.sci.conferencias as conferencia>
				  		<div class="panel panel-success">
				  			<div class="panel-heading">${conferencia.nome}, ${conferencia.data}</div>
				  			<div class="panel-body">Você foi ${conferencia.cargo} nesta conferência. <a href="${conferencia.url}">Clique aqui</a> para ir ao site do evento.</div>
				  		</div>
				  	</#list>
				</#if>
			  </div>
			</div>

			<div class="panel panel-default col-md-6">
			  <div class="panel-heading">Últimos trabalhos</div>
			  <div class="panel-body">
			  	<#if sci.trabalhos??>
				  	<#list sci.trabalhos as trabalho>
					  	<div class="panel panel-success">
					  		<div class="panel-heading">${trabalho.titulo}, <span style="font-size:14px;">${trabalho.posicao}</span></div>
				  			<div class="panel-body">${trabalho.notasDoAutor}<br><br>${trabalho.area.nome}</div>
					  	</div>
				  	</#list>
				</#if>
			  </div>
			</div>

</div>

<div class="container mainBox">
	<div class="col-lg-12">
	Post 1
	</div> 
</div> 

<div class="container mainBox">
	<div class="col-lg-12">
	Post 2
	</div> 
</div> 
 
 
<div class="container mainBox">
	<div class="col-lg-12">
	Post 3
	</div> 
</div> 


<div class="container mainBox">
	<div class="col-lg-12">
	Post 4
	</div> 
</div> 
 
 <#include "/footer.ftl">
