

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="TO.EfetuarSaqueTO"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Efetuar Saque</title>
</head>
<body>
	<%
		EfetuarSaqueTO efSaqueTO = (EfetuarSaqueTO) request.getAttribute("EfetuarSaque");
	%>
	Agencia:
	<%=efSaqueTO.getAgencia()%><br> Conta:
	<%=efSaqueTO.getConta()%><br> Valor:
	<%=efSaqueTO.getValor()%><br>
</body>
</html>