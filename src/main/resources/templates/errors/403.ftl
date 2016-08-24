<#include "header">
<h1>Você não tem permissão nesta página!</h1>
<form action="/logout" method="post">
          <input type="submit" value="Entrar como um usuário diferente" /> 
          <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form>
<#include "footer">