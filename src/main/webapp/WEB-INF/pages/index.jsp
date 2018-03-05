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

    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>

    <script>
        function onLoad() {
            var urlToJSON = "http://127.0.0.1:1478/hello/Jared.json";
            getJSON(urlToJSON);
        }

        function getJSON(url) {
            $.getJSON(url, function (json) {
                console.log(json);
            });
        }

        $(document).ready(onLoad());

    </script>

    <title>
        root
    </title>
</head>
<body>

</body>
</html>