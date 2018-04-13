<%@ page language="java" contentType="text/html; charset=GB2312"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <s:form action="LoginAction" method="post">
 <s:label value="登录"></s:label>
  <s:textfield name="account" label="请输入用户名"></s:textfield>
  <s:password name="password" label="请输入密码"></s:password>
  <s:submit value="登录" ></s:submit>
  </s:form>
</body>
</html>