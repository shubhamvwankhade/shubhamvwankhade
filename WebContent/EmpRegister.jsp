<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Employee here</title>
</head>
<body>
<h1>Emp Registration</h1>

<form:form method="post" action="saveemp">

<table>
<tr>
<td>Emp Id:</td> <td><form:input path="id"/></td>
</tr>

<tr>
<td>Emp Name:</td> <td><form:input path="name"/></td>
</tr>

<tr>
<td>Emp Salary:</td> <td><form:input path="salary"/></td>
</tr>

<tr>
<td>Emp deisgnation:</td> <td><form:input path="designation"/></td>
</tr>
</table>

</form:form>
</body>
</html>