<!DOCTYPE html>
<head>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>ScientificIn</title>
	
	<link rel="stylesheet" href="/css/bootstrap.min.css"/>
	<link rel="stylesheet" href="/css/bootstrap-theme.min.css"/>
	<link rel="stylesheet" href="/css/jqcloud.min.css"/>
	<link rel="stylesheet" href="/css/style.css"/>
	<link rel="stylesheet" href="/css/teste.css">
	<#if springMacroRequestContext.getRequestUri() == "/" || springMacroRequestContext.getRequestUri() == "/index">
		<link rel="stylesheet" href="/css/teste2.css">
	</#if>
	<#if springMacroRequestContext.getRequestUri() == "/login">
		<link rel="stylesheet" href="/css/teste3.css">
	</#if>
	
</head>
<body>

<#if springMacroRequestContext.getRequestUri() != "/">
	<#include "/navbar.ftl">
</#if>