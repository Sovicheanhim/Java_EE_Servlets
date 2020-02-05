<%--
  Created by IntelliJ IDEA.
  User: Sovichea
  Date: 2/5/2020
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Authentication</title>
  </head>
  <body>
    <form id="authentication" action="Servlet" method="post">
      <input type="text" value="name">
      <select name="role">
        <option value="admin">Admin</option>
        <option value="supervisor">Supervisor</option>
        <option value="teacher">Teacher</option>
      </select>
      <input type="submit" value="Submit">
    </form>

  </body>
</html>
