<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원가입</title>
</head>
<body>
	<form action ="join.bs" method="post">
	아이디 : <input type = "text" name = "id"/><br/>
	암     호 : <input type = "password" name = "pw"/><br/>
	암호확인 : <input type = "password" name = "pw1"/><br/>
	이     름 : <input type = "text" name ="name" /><br/>
	나     이 : <input type = "text" name = "age" /><br/>
	<input type = "submit" value = "회원가입" />
	</form>
</body>
</html>
