<#include "/header.ftl">
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header col-sm-12">
				<a class="navbar-brand" href="#">Utilizando motor MQ5000 para criar redemoinhos no tiet� e filtrar sua �gua.</a>
			</div>
			<ul class="nav nav-tabs">
				<li role="presentation" class="active"><a data-toggle="tab" href="#biografia">Autor</a></li>
				<li role="presentation"><a data-toggle="tab" href="#notas-autor">Notas do autor</a></li>
				<li role="presentation"><a data-toggle="tab" href="#artigo">Artigo</a></li>
				<li role="presentation"><a data-toggle="tab" href="#avaliacoes">Avalia��es</a></li>
				<li role="presentation"><a data-toggle="tab" href="#bibliografia">Bibliografia</a></li>
			</ul>
		</div>
	</nav>
	
	<div class="tab-content">
		<div id="biografia" class="tab-pane fade in active">
			Aqui deve ter o nome do autor e sua apresenta��o. Inclui-se tamb�m um link para seu perfil SciIn.
		</div>
		
		<div id="notas-autor" class="tab-pane fade">
			<p>Aqui podemos colocar notas que o autor deseje colocar sobre o trabalho, ap�s sua publica��o, caso ache �til.
			Se o autor n�o colocar nada, podemos deixar o resumo da publica��o.</p>
		</div>
		
		<div id="artigo" class="texto-projeto tab-pane fade">
			<h2 class="titulo-projeto">Utilizando motor MQ5000 para criar redemoinhos no tiet� e filtrar sua �gua.</h2>
			<p>Minha v� de muletas costumava ser uma pessoa boa
				que gostava de comer doces e particularmente chiclete.
				Este texto � um pouco in�til e s� estou o colocando aqui
				para termos j� um texto e ver como vai ficar no HTML
				al�m de refor�ar minha mente e fazer eu acreditar que
				algum dia conseguirei fazer um texto que cause impacto
				no planeta que nem um metoro e exploda a porra toda.
				Tipo uma bomba.txt, seria top.
				Zuera. Favor n�o chamar a pol�cia, n�o sou terrorista
				nem algo do tipo. Um abra�os a todos, � n�s pessoal!</p>
		</div>
		
		<div id="avaliacoes" class="avaliacoes-projeto tab-pane fade">
			<label>Ranking ScientificIn:</label>
			<a href="#">1�</a>
			
			<label>Ranking na �rea:</label>
			<a href="#">1�</a>
			
			<label>Ranking na sub-�rea</label>
			<a href="#">1�</a>
			
			<div class="comentarios">
				<div class="comentario">
					<h4>Ruan Noronha</h4>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star-empty"></div>
					<div class="glyphicon glyphicon-star-empty"></div>
					<div class="texto-comentario">
						Muito bom, me ajudou com minha tese de
						mestrado! Obrigad�o! Abra�os.
					</div>
				</div>
				<div class="comentario">
					<h4>Degustador de Pesquisas</h4>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star-empty"></div>
					<div class="glyphicon glyphicon-star-empty"></div>
					<div class="glyphicon glyphicon-star-empty"></div>
					<div class="texto-comentario">
						Se eu fosse da �rea, com certeza usaria
						esse conte�do.
					</div>
				</div>
				<div class="comentario">
					<h4>Amigo do cara</h4>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="glyphicon glyphicon-star"></div>
					<div class="texto-comentario">
						EAE! Nem sei o que estou fazendo aqui,
						sou s� amigo do cara e ele pediu que
						eu desse 5 estrelas.
						
						Valeu amig�o! Abra�os!
					</div>
				</div>
			</div>
		</div>
		
		<div id="bibliografia" class="tab-pane fade">
			<dl>
				<dt>Algoritmos e Estrutura de Dados 2, A. B. Blacksmith</dt>
				<dd>Editora Mar�omeum�s, Abril 2004.</dd>
				<dt>Os efeitos da cannabis na pupila dilatada de gatos dom�sticos</dt>
				<dd>Editora � brux�o mesmo, 2006.</dd>
			</dl>
		</div>
	</div>
<#include "/footer.ftl">