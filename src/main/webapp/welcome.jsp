<%--
  Created by IntelliJ IDEA.
  User: Administractor
  Date: 2017/5/30
  Time: 23:26
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Hello</title>
</head>
<body>
<h2>Welcome</h2>
<s:if test="#session.user!=null">
    <h2>Hello <s:property value="#session.user.name"/></h2>
</s:if>
</body>
</html>
