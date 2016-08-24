<#include "/header.ftl"> 
<br> 
<p>Resultado para:</p>
<#list 0..4 as i>
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
<br>
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

<br>

<#if arr[0] ??>	
<div style="display:visible" id="divt1" class = "tabout">
	<table border = 1 id = "tabo1">
	<caption>Estágio</caption>
	<th>ID</th>
	<th>EMPRESA</th>
	<th>AREA</th>
	<th>DESCRIÇÂO</th>
    <#list listEstagio as lista1>
	<tr>
        <td> <a href="/estagio?getId=${lista1.id}">${lista1.id}</a></td>
        <td>${lista1.EMPRESA}</td>
        <td>${lista1.AREA}</td>
        <td>${lista1.DESCR}</td>                
    </tr>			
	</#list>		
	</table>
	<br><br>
</div>
</#if>

<#if arr[1] ??>	
<div style="display:visible" id="divt2" class = "tabout">
	<table border = 1 id = "tabo2">
	<caption>Estagiário</caption>
	<th>ID</th>
	<th>EMPRESA</th>
	<th>AREA</th>
	<th>DESCRIÇÂO</th>
    <#list listEstagiario as lista2>	
	<tr>
        <td> <a href="/estagiario?getId=${lista2.id}">${lista2.id}</a></td>
        <td>${lista2.EMPRESA}</td>
        <td>${lista2.AREA}</td>
        <td>${lista2.DESCR}</td>                
    </tr>			
	</#list>		
	</table>
	<br><br>
</div>
</#if>

<#if arr[2] ??>
<div style="display:visible" id="divt3" class = "tabout">
	<table border = 1 id = "tabo1">
	<caption>Sociedade</caption>
	<th>ID</th>
	<th>DONO</th>
	<th>EMPRESA</th>
	<th>AREA</th>
	<th>DESCRIÇÂO</th>
    <#list listSocio as lista3>	
	<tr>
        <td> <a href="/sociedade?getId=${lista3.id}">${lista3.id}</a></td>        
        <td>${lista3.DONO}</td>
        <td>${lista3.EMPRESA}</td>
        <td>${lista3.AREA}</td>
        <td>${lista3.DESCR}</td>                
    </tr>			
	</#list>	
	</table>
	<br><br>
</div>
</#if>

<#if arr[3] ??>	
<div style="display:visible" id="divt4" class = "tabout">
	<table border = 1 id = "tabo4">
	<caption>Orientador</caption>
	<th>ID</th>
	<th>ORIENTADOR</th>
	<th>AREA</th>
	<th>DESCRIÇÂO</th>			
    <#list listOrientador as lista4>	
	<tr>
		<td> <a href="/orientador?getId=${lista4.id}">${lista4.id}</a></td>        
        <td>${lista4.ORIENTADOR}</td>
        <td>${lista4.AREA}</td>
        <td>${lista4.DESCR}</td>                
    </tr>			
	</#list>		
	</table>
	<br><br>
</div>
</#if>

<#if arr[4] ??>
<div style="display:visible" id="divt5" class = "tabout">
	<table border = 1 id = "tabo5">
	<caption>Aluno</caption>
	<th>ID</th>
	<th>ORIENTANDO</th>
	<th>AREA</th>
	<th>DESCRIÇÂO</th>	
    <#list listAluno as lista5>	
	<tr>
        <td> <a href="/aluno?getId=${lista5.id}">${lista5.id}</a></td>        
        <td>${lista5.ORIENTANDO}</td>
        <td>${lista5.AREA}</td>
        <td>${lista5.DESCR}</td>                
    </tr>			
	</#list>		
	</table>
	<br><br>
</div>
</#if>
<br>
<a href="/match">Voltar</a>
<#include "/footer.ftl"> 