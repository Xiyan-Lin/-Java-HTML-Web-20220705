<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
	<head>
		<link rel="stylesheet" href="https://unpkg.com/purecss@2.1.0/build/pure-min.css">
		<meta charset="UTF-8">
		<title>Upload Form</title>
	</head>
	<body style="padding: 15px">
		<form class="pure-form" method="post" enctype="multipart/form-data" action="/JavaWeb_20220705/servlet/upload">
			<fieldset>
				<legend>Upload Form</legend>
				品名1: <input type="text" placeholder="請輸入品名" name="pname" /><p />
				價格1: <input type="number" placeholder="請輸入價格" name="price" /><p />
				照片1: <input type="file" name="file1" /><p />
				<br /><br />
				品名2: <input type="text" placeholder="請輸入品名" name="pname" /><p />
				價格2: <input type="number" placeholder="請輸入價格" name="price" /><p />
				照片2: <input type="file" name="file1" /><p />
				<p />
				<button type="reset" class="pure-button pure-button-primary">重置</button>
				<button type="submit" class="pure-button pure-button-primary">上傳</button>
			</fieldset>
		</form>
		
	</body>
</html>