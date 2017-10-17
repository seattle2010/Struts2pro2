<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:debug/>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>货品显示列表</title>
</head>
<body>
<%--<a href="/product_edit">添加货品</a>--%>
	<s:a namespace="/" action="product_input">添加货品</s:a>
	<table border="1" cellpadding="0" cellspacing="0" width="90%">
		<tr>
			<th>货品编号</th>
			<th>货品名称</th>
			<th>货品品牌</th>
			<th>货品分类</th>
			<th>供&nbsp;应&nbsp;商</th>
			<th>零&nbsp;售&nbsp;价</th>
			<th>成&nbsp;本&nbsp;价</th>
			<th>折&emsp;&emsp;扣</th>
			<th>操&emsp;&emsp;作</th>
		</tr>
<s:iterator value="#products">
<%--<s:iterator value="#products" var="p">   p.id--%>
		<tr>
			<td><s:property value="id"/> </td>
			<td><s:property value="productName"/> </td>
			<td><s:property value="brand"/> </td>
			<td><s:property value="dir_id"/> </td>
			<td><s:property value="supplier"/> </td>
			<td><s:property value="salePrice"/> </td>
			<td><s:property value="costPrice"/> </td>
			<td><s:property value="cutoff"/> </td>
			<td>
				<s:a namespace="/" action="product_input">
					<s:param name="product.id" value="id"></s:param>
					编辑</s:a>

				<s:a namespace="/" action="product_delete">
					<s:param name="product.id" value="id"></s:param>
					删除</s:a>
			</td>
		</tr>
</s:iterator>
	</table>
</body>
</html>