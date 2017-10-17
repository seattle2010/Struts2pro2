
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<s:iterator begin="1" end="10" step="1" var="num">
	<s:property value="#num"></s:property>
</s:iterator>
<%--迭代集合--%>
<%
	request.setAttribute("numList",java.util.Arrays.asList("A","B","C","D"));
%>
<s:iterator value="#request.numList" var="ch">
	<s:property value="#ch"/>
</s:iterator>
</body>
</html>
