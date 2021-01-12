<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
hello~~
<%
	//콘솔 출력
	System.out.println("jspService()");
%>

<%!
	public void jspInit(){
		System.out.println("jspInit()!!!!");
	}

	public void jspDestroy(){
		System.out.println("jspDestroy()");
	}
%>

</body>
</html>