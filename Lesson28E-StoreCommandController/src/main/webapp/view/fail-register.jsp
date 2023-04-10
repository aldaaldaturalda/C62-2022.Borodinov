<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Fail register</title>
    <link rel="stylesheet" href="<c:url value="/css/page.css"/>">
</head>
<body>
<div class="login-box">
    <h2>Sorry</h2>
    <p style="color: #eeeeee; text-align: center">${requestScope.invalid}</p>
    <a href="<c:url value="/eshop?command=login"/>" class="button">Re-login</a>
</div>
</body>
</html>