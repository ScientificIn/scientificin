<#include "/header.ftl">

<div class="container">

		<div class="col-lg-12">
		
<form method="post" action="/cadastroCompleto">
  <fieldset class="form-group">
    <label for="exampleInputEmail1">Email</label>
    <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Insira email">
    <small class="text-muted">N�s n�o compartilhamos seu endere�o de email com outros.</small>
  </fieldset>
  <fieldset class="form-group">
    <label for="exampleInputPassword1">Senha</label>
    <input type="password" class="form-control" id="exampleInputPassword1" placeholder="Senha">
  </fieldset>
  <fieldset class="form-group">
    <label for="exampleSelect1">Forma��o</label>
    <select class="form-control" id="exampleSelect1">
      <option>PhD</option>
      <option>Doutorando</option>
      <option>Mestrando</option>
      <option>Aluno de gradua��o</option>
    </select>
  </fieldset>
    <fieldset class="form-group">
    <label for="areaDeInteresse">Principal �rea de interesse</label>
    <input type="text" class="form-control" id="areaDeInteresse" placeholder="�rea de interesse">
  </fieldset>
  <fieldset class="form-group">
    <label for="exampleTextarea">Resumo pessoal</label>
    <textarea class="form-control" id="exampleTextarea" rows="3"></textarea>
  </fieldset>
  <fieldset class="form-group">
    <label for="exampleInputFile">Foto</label>
    <input type="file" class="form-control-file" id="exampleInputFile">
  </fieldset>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
		</div>
<!-- 		<div class="col-lg-4">
		
		</div>
 -->


</div>

<#include "/footer.ftl">