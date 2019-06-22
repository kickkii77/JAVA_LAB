<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>

	<div class = "container">
	
	<h3>게시판 글쓰기</h3>
	<hr />
	<form action = "boardw.bs" method="post">
	<div style ="width:700px; border:1px solid #cccccc; padding : 20px">
		<div class = "form-inline" style="margin-bottom:5px">
		<label style = "width:100px">제목</label>
		<input type ="text" name = "t" style="width:400px" class="form-control" placeholder="제목"/>
		</div>
		
		<div class="form-inline">
		<label style = "width:100px">내용</label>
		<textarea rows="6"name = "c"  style="width:400px" placeholder="내용"></textarea>
		</div>
		
		<div class="form-inline" style="margin-bottom:5px">
		<label style = "width:100px">작성자</label>
		<input type ="text" name = "w" class="form-control" placeholder="작성자"/>
		</div>
		
		<div class="form-inline" style="margin-bottom:5px">
		<label style = "width:100px">작성자</label>
		<input type ="submit" class="btn btn-primary" value="글쓰기"/>
		<a href = "index.bs" class="btn btn-secondary">홈으로</a>
		</div>
	
	</div></form>

</body>
</html>
