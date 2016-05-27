
// index.jsp


<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
	<head>

		<meta http-equip="Content-Type" content="text/html; charset=UTF-8">

		<title>MercadoOnline</title>

	</head>
	<body>

		<jsp:useBean id="mybean" scope="session" class="org.pacote.hello.Vendas"/>
		<jsp: setProperty nome="mybean" property= "nome" />

		<h3>Nome do produto: <jsp:getProperty nome="mybean" property="nome"  />!</h3>

		<h3>Tipo do produto: <jsp:getProperty tipo="mybean" property="Tipo"  />!</h3>
		
		<h3>Quantidade: <jsp:getProperty qtde="mybean" property="qtde"  />!</h3>

		<h3>Preço: <jsp:getProperty preco="mybean" property="preco"  />!</h3>

		<h3>Tipo do Negócio(Compra e Venda): <jsp:getProperty negocio="mybean" property="negocio"  />!</h3>

	</body>

</html>
