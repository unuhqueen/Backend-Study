<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	for(int i=1; i<=5; i++){
%>
	<H<%=i %>>�Ƹ��ٿ� �ѱ�</H<%=i %>>
<%
	}
%>
</body>
</html>