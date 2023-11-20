<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 2023/11/18
  Time: 15:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>个人所得税计算</title>
</head>
<body>
<h1>个人所得税计算</h1>
<form action="calculate" method="POST">
  <label for="income">月收入：</label>
  <input type="number" name="income" required>
  <br>
  <input type="submit" value="计算">
</form>
</body>
</html>
