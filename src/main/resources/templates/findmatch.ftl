<#include "/header.ftl"> 
<br> 
<form action="/match" method="post"> 
  <p>Procurando</p> 
  <div id=mydiv0> 
    <input type="checkbox" name="Estagio" value="0" class="checkboxTeste"> Estágio<br>
  </div>    
   
  <div id=mydiv1> 
  <input type="checkbox" name="Estagiario" value="1" class="checkboxTeste"> Estagiário<br>
  </div> 
 
  <div id=mydiv2> 
    <input type="checkbox" name="Socio" value="2" class="checkboxTeste"> Sócio<br>
  </div> 
 
  <div id=mydiv3> 
    <input type="checkbox" name="Orientador" value="3" class="checkboxTeste"> Orientador<br>
  </div> 
   
  <div id=mydiv4> 
    <input type="checkbox" name="Aluno" value="4" class="checkboxTeste"> Aluno<br>
  </div> 
   
    <br> 
    <input type="hidden"  name="${_csrf.parameterName}"   value="${_csrf.token}"/> 
    <input type="submit" value="Enviar"> 
    <button type="button" name="back" onclick="history.back()">Voltar</button>
</form> 
 
<#include "/footer.ftl"> 