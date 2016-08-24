<#include "/header.ftl"> 
<br> 
<p>Resultado para:</p>

<#assign x=4>
<#assign str="">
<#list 0..x as i>
	<#if arr[i] ??>
		<#if i == 0>
			<#assign str="Estágio">		
		<#elseif i == 1>
			<#assign str="Estagiário">
		<#elseif i == 2>
			<#assign str="Sociedade">
		<#elseif i == 3>
			<#assign str="Orientador">
		<#else>
			<#assign str="Aluno">		
		</#if>
		<p>${str} em ${arr[i]}</p>
	</#if>	
</#list>
<br><p>bla bla bla TO DO</p><br>

<form name="formA">
	<#list 0..4 as i>
	<#if arr[i] ??>
		<#if i == 0>
			<input type="checkbox" value="1" checked = "checked" id="check1" onclick = "myFunctionVis(this.value)" style="display:visible"> Estágio  
		<#elseif i == 1>
			<input type="checkbox" value="2" checked = "checked" id="check2" onclick = "myFunctionVis(this.value)" style="display:visible"> Estagiário  
		<#elseif i == 2>
			<input type="checkbox" value="3" checked = "checked" id="check3" onclick = "myFunctionVis(this.value)" style="display:visible"> Sociedade  
		<#elseif i == 3>
			<input type="checkbox" value="4" checked = "checked" id="check4" onclick = "myFunctionVis(this.value)" style="display:visible"> Orientador  
		<#else>
			<input type="checkbox" value="5" checked = "checked" id="check5" onclick = "myFunctionVis(this.value)" style="display:visible"> Aluno
		</#if>		
	</#if>	
	</#list>
</form>

<br>
<div style="display:visible" id="divt1" class = "tabout">
	<table border = 1 id = "tabo3">
	<#list listEstagio as lista1>	
	<tr>
        <td>${lista1.id2}</td>
        <td>${lista1.EMPRESA}</td>
        <td>${lista1.area}</td>
        <td>${lista1.DESC}</td>        
        <td> <a href="/estagio?getId=${lista1.id}">Link</a></td>
    </tr>			
	</#list>
	</table>
</div>

<br><br>

<div style="display:visible" id="divt4" class = "tabout">
<table border = 1 id = "tabo4">
<#list listOrientador as lista2>	
	<tr>
        <td>${lista2.id}</td>
        <td>${lista2.ORIENTADOR}</td>
        <td>${lista2.AREA}</td>
        <td>${lista2.DESC}</td>        
        <td> <a href="/orientador?getId=${lista2.id}">Link</a></td>
    </tr>			
</#list>
</table>
</div>

<br>
<a href="/match">Voltar</a>
<br>
<#include "/footer.ftl"> 