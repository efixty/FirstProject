<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 28/02/18
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Admin</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/adminsPage" method="post">
    <sf:input type="text" name="username" path="username"/><p/>
    <sf:input type="password" name="password" path="password"/><br><sf:errors path="password"/><p/>
    <input type="submit"/>
</form>
</body>
</html>
