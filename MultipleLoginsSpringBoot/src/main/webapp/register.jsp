<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="reister">
Name:-<input type="text" name="name">
<br>
Address:-<input type="text" name="address">
<br>
Role:-<select name="rollname">
     <option value="admin">admin</option>
     <option value="manager">manager</option>
     <option value="user">user</option>
</select>
<br>
Username:-<input type="text" name="username">
<br>
Password:-<input type="text" name="password">
<br>
<input type="submit" value="register">
</form>
</body>
</html>