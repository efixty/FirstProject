<%--
  Created by IntelliJ IDEA.
  User: efixty
  Date: 28/02/18
  Time: 18:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file='../static/js/Script.js'%>

<html>
<head>
    <title>Admin's Page</title>
    <script src="../../../resources/static/js/Script.js"></script>
</head>
<body bgcolor="#ccff00">
    <p><h3>Hi, ${adminUsername}</h3></p>

    <div>
        <p>
        <table border="10px">
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
    <form>
        <input type="button" name="test" value="Click me" onclick="alertMe()">
    </form>
</body>
</html>
