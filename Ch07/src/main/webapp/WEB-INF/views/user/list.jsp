<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>user-list</title>
</head>
<body>
	<h3>���� ���</h3>
	
	<table border="1">
		<tr>
			<th>���̵�</th>
			<th>�̸�</th>
			<th>�޴���</th>
			<th>����</th>
			<th>�μ�</th>
			<th>�Ի���</th>
			<th>����</th>		
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
				<a href="#">����</a>
				<a href="#">����</a>
			</td>
		</tr>
		</c:forEach>
	</table>
</body>
</html>