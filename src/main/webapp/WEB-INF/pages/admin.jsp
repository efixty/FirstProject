<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 28/02/18
  Time: 18:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<form action="${pageContext.request.contextPath}/adminsPage" method="post">
    <input type="text" name="username"/><p/>
    <input type="password" name="password"/><p/>
    <input type="submit"/>
</form>