<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
    <%@ page import="Dao.*,guitar.guitar,java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <style type="text/css">
        td
        {
         border-width:1px;
         border-style:solid;
         text-align:center;
         height:40px;
        }
</style>

<title>所有吉他</title>
</head>

<body>
<h1 align=center>吉他销售系统（3）</h1>
<hr/>
    <h2 align=center>所有吉他</h2>

    <table width="600"  border="1" cellpadding="0" cellspacing="0" align="center">

<tr>
    <td><strong>系列名</strong></td>
	<td><strong>厂商</strong></td>
	<td><strong>型号</strong></td>
	<td><strong>类型</strong></td>
	<td><strong>后板材质</strong></td>
	<td><strong>前板材质</strong></td>
	<td><strong>价格</strong></td>
	<td><strong>删除</strong></td>
</tr>


<c:forEach items="${list}" var="p">
	<tr>
	<td>${p.serialNumber}</td>
	<td>${p.getSpec().getBuilder()}</td>
	<td>${p.getSpec().getModel()}</td>	
	<td>${p.getSpec().getType()}</td>
	<td>${p.getSpec().getBackWood()}</td>
    <td>${p.getSpec().getTopWood()}</td>
	<td>${p.price}</td>	
	<td><a href="delete?serialNumber=${p.serialNumber}">删除</a>
	</tr>

</c:forEach>
</table>

</body>
</html>