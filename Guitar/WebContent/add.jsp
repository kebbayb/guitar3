<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加吉他</title>
</head>
<body>
<h1 align=center>吉他销售系统（3）</h1>
<hr/>

<div align=center>
<form action="add" method="get">
<strong>价格：</strong><input type=text name="price"/><br/><br/>
<strong>系列名：</strong><input type=text name="serialnumber"/><br/><br/>
<strong>类型：</strong><input type=text name="type"/><br/><br/>
<strong>厂商：</strong><input type=text name="builder"/><br/><br/>
<strong>型号：</strong><input type=text name="model"/><br/><br/>
<strong>后板材质：</strong><input type=text name="backwood"/><br/><br/>
<strong>前板材质：</strong><input type=text name="topwood"/><br/><br/>
<input type=submit value="添加吉他"/>
</form>
</div>
</body>
</html>
