<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
	<title>Title</title>
</head>
<body>
<h3>注册页面</h3>
<s:form namespace="/" action="" method="POST" theme="simple">
	<s:hidden name="id" value="123"/> <br>
	账号: <s:textfield name="username"/> <br>
	密码: <s:password name="password"/> <br>
	性别: <s:radio name="sex" list="#{'0':'男','1':'女'}"/> <br>
	爱好: <s:checkboxlist name="hobby" list="#{'java':'java语言','c':'c语言'}"/>
	城市: <s:select name="city" list="{'沈阳','大连','哈尔滨'}" headerKey="-1" headerValue="请选择"/>
	简介: <s:textarea name="info" cols="20" rows="5"/>
	<s:submit value="注册"/>
</s:form>
</body>
</html>
