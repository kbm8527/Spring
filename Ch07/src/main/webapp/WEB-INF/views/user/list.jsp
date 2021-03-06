<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>user-list</title>
</head>
<body>
	<h3>직원 목록</h3>
	
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>이름</th>
			<th>휴대폰</th>
			<th>직급</th>
			<th>부서</th>
			<th>입사일</th>
			<th>관리</th>		
		</tr>
		
		<c:forEach var="user" items="${users}">
		
		<tr>
			<td>${user.uid}</td>
			<td>${user.name}</td>
			<td>${user.hp}</td>
			<td>${user.pos}</td>
			<td>${user.dep}</td>
			<td>${user.rdate}</td>
			<td>
				<a href="#">수정</a>
				<a href="#">삭제</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>