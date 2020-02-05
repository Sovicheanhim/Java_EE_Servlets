<%--
  Created by IntelliJ IDEA.
  User: Sovichea
  Date: 2/5/2020
  Time: 10:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency</title>
</head>
<body>
    <form method="post" action="CurrencyServlet">
        Enter your money in USD: <input type="number" name="money">
        <select name="type">
            <option value="riel">Riel</option>
            <option value="baht">Baht</option>
            <option value="yuan">Yuan</option>
        </select>
        <input type="submit" value="Exchange">
    </form>
</body>
</html>
