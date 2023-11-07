<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/laptopInput" method="post">
Brand: <input type="text" name="laptop" />
<br/>
<input type="submit" value="Afisare"/>
</form>
Laptop brand   ${laptopBrand} 
<br/>is made out of  "${length}" characters
<br/>
Laptop name stands from ${isPar} characters
</body> 
</html>