<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Kolya is number one Developer" %>
</h1>
<h3>
    <%@page import="main.lesson24servlet.Calculator" %>
    <%
        Calculator calculator = new Calculator();
        for (int i = 0; i < 10; i++) {
            out.println("Kolya hello " + i);
        }
    %>
</h3>
<br/>
<a href="myservlet">Hello Servlet</a>
</body>
</html>