<#include "/header.ftl">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header col-sm-12">
				<a class="navbar-brand" href="#">${trabalho.titulo}</a>
			</div>
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a data-toggle="tab" href="#biografia">Autor</a></li>
				<li role="presentation"><a data-toggle="tab" href="#notas-autor">Notas do autor</a></li>
				<li role="presentation"><a data-toggle="tab" href="#artigo">Artigo</a></li>
				<li role="presentation"><a data-toggle="tab" href="#avaliacoes">Avaliações</a></li>
				<li role="presentation"><a data-toggle="tab" href="#bibliografia">Bibliografia</a></li>
			</ul>
		</div>
	</nav>
	
	<div class="tab-content">
		<div id="biografia" class="tab-pane fade in active">
			${sci.biografia}
		</div>
		
		<div id="notas-autor" class="tab-pane fade">
			<p>${trabalho.notasDoAutor}</p>
			
			<div class="detalhes-trabalho-recursos">
				<#list trabalho.recursos as rec>
					<a href="${rec.link}">${rec.nome}</a>
				</#list>
			</div>
		</div>
		
		<div id="artigo" class="texto-projeto tab-pane fade">
			<h2 class="titulo-projeto">${trabalho.titulo}</h2>
			<p>${trabalho.texto}</p>
		</div>
		
		<div id="avaliacoes" class="avaliacoes-projeto tab-pane fade">
			<label>Ranking ScientificIn:</label>
			<a href="/rankings">${trabalho.posicao}</a>
			
			<label>Ranking na área:</label>
			<a href="/rankings/area/${trabalho.posicaoNaArea}">1�</a>
			
			<label>Ranking na sub-área</label>
			<a href="/rankings/subarea/${trabalho.posicaoNaSubArea}">1�</a>
			
			<div class="comentarios">
				<#list trabalho.avaliacoes as aval>
					<div class="comentario">
						<h4>${sci.nome}</h4>
						<#list 1..aval.nota as n>
							<div class="glyphicon glyphicon-star"></div>
						</#list>
						<#list aval.nota..5 as n>
							<div class="glyphicon glyphicon-star-empty"></div>
						</#list>
						<div class="texto-comentario>
							${aval.comentario}
						</div>
					</div>
				</#list>
			</div>
		</div>
		
		<div id="bibliografia" class="tab-pane fade">
			<dl>
				<#list trabalho.bibliografias as bibliografia>
					<dt>${bibliografia.nome}</dt>
					<dd>${bibliografia.detalhes}</dd>
				</#list>
			</dl>
		</div>
	</div>
<#include "/footer.ftl">