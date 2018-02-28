<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 28/02/18
  Time: 17:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<c:forEach var="row" items="questions">
    <p>
        ${row}
    </p>
</c:forEach>
</body>
</html>
