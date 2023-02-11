<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Our calculator" %>
</h1>
<br/>
<jsp:forward page="/calculator?val1=100&val2=20&calculationName=division"/>
</body>
</html>