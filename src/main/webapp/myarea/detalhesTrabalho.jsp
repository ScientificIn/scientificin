<%@ include file="/header.jsp" %>
	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header col-sm-12">
				<a class="navbar-brand" href="#">Utilizando motor MQ5000 para criar redemoinhos no tietê e filtrar sua água.</a>
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
			Aqui deve ter o nome do autor e sua apresentação. Inclui-se também um link para seu perfil SciIn.
		</div>
		
		<div id="notas-autor" class="tab-pane fade">
			<p>Aqui podemos colocar notas que o autor deseje colocar sobre o trabalho, após sua publicação, caso ache útil.
			Se o autor não colocar nada, podemos deixar o resumo da publicação.</p>
		</div>
		
		<div id="artigo" class="texto-projeto tab-pane fade">
			<h2 class="titulo-projeto">Utilizando motor MQ5000 para criar redemoinhos no tietê e filtrar sua água.</h2>
			<p>Minha vó de muletas costumava ser uma pessoa boa
				que gostava de comer doces e particularmente chiclete.
				Este texto é um pouco inútil e só estou o colocando aqui
				para termos já um texto e ver como vai ficar no HTML
				além de reforçar minha mente e fazer eu acreditar que
				algum dia conseguirei fazer um texto que cause impacto
				no planeta que nem um metoro e exploda a porra toda.
				Tipo uma bomba.txt, seria top.
				Zuera. Favor não chamar a polícia, não sou terrorista
				nem algo do tipo. Um abraços a todos, é nós pessoal!</p>
		</div>
		
		<div id="avaliacoes" class="avaliacoes-projeto tab-pane fade">
			<label>Ranking ScientificIn:</label>
			<a href="#">1º</a>
			
			<label>Ranking na área:</label>
			<a href="#">1º</a>
			
			<label>Ranking na sub-área</label>
			<a href="#">1º</a>
			
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
						mestrado! Obrigadão! Abraços.
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
						Se eu fosse da área, com certeza usaria
						esse conteúdo.
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
						sou só amigo do cara e ele pediu que
						eu desse 5 estrelas.
						
						Valeu amigão! Abraços!
					</div>
				</div>
			</div>
		</div>
		
		<div id="bibliografia" class="tab-pane fade">
			<dl>
				<dt>Algoritmos e Estrutura de Dados 2, A. B. Blacksmith</dt>
				<dd>Editora Marçomeumês, Abril 2004.</dd>
				<dt>Os efeitos da cannabis na pupila dilatada de gatos domésticos</dt>
				<dd>Editora É bruxão mesmo, 2006.</dd>
			</dl>
		</div>
	</div>
<%@ include file="/footer.jsp" %>