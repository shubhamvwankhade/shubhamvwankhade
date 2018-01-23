
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Login</title>
</head>
<body>
<h1>Employee can login here</h1>

<form:form method="post" action="emplogin">
<table>
<tr>
<td>Emp Name    </td>
<td><form:input path="name"/></td>

</tr>
<tr>
<td>Designation </td>
<td><form:password path="designation"/></td>
</tr>
<tr>
<td><input type="submit" value="Login"/></td>
</tr>

</table>

</form:form>

</body>
</html>