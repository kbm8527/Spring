<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>user-register</title>
</head>
<body>
	<h3>���� ����ϱ�</h3>
	
	<form action="/ch07/user/register" method="post">
		<table border="1">
			<tr>
				<td>���̵�</td>
				<td><input type="text" name="uid" /></td>
			</tr>		
			<tr>
				<td>�̸�</td>
				<td><input type="text" name="name" /></td>
			</tr>		
			<tr>
				<td>�޴���</td>
				<td><input type="text" name="hp" /></td>
			</tr>		
			<tr>
				<td>����</td>
				<td>
					<select name="pos">
						<option>���</option>
						<option>�븮</option>
						<option>����</option>
						<option>����</option>
						<option>����</option>
					</select>
				</td>		
			</tr>		
			
			<tr>
				<td>�μ�</td>
				<td>
					<select name="dep">
						<option value="101">����1��</option>
						<option value="102">����2��</option>
						<option value="103">����3��</option>
						<option value="104">�λ��</option>
						<option value="105">����������</option>
					
					</select>
				</td>		
			</tr>	
						
			<tr>
				<td colspan="2" >
					<input type="submit" value"����ϱ�"/>
				</td>
			</tr>
			
		</table>
	</form>

</body>
</html>