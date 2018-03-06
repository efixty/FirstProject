<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 28/02/18
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Admin's Page</title>
    <script src="${pageContext.request.contextPath}/static/js/script.js" ></script>
</head>
<body bgcolor="#ccff00">
    <p><h3>Hi, ${adminUsername}</h3></p>

    <div>
        <p>
        <table id="maintable" class="tableofesiminchvorychiashxati100" border="10px">
        <tr>
            <td>
            <form>
            Your question:<br>
            <input id="question1" type="text"><br>
            Your question:<br>
            <input id="answer1" type="text">
            </form>
            </td>
        </tr>
        </table>
        </p>
    </div>
    <div id="divForI"></div>
    <form>
        <input type="button" name="test" value="Click me" onclick="addQAForm()">
    </form>
</body>
</html>
