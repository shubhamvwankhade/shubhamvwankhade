<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Provider Login</title>
</head>
<body>

<h1>Job Provider Can Login Here</h1>

<form:form method="post" action="jobproviderlogin">

<table>
<tr>
<td>
 Contact No :
</td>
<td>
<form:input path="contactNo"/>
</td>
</tr>

<tr>
<td>
  Name :
</td>
<td>
<form:password path="jobName" />
</td>
</tr>

<tr>
<td>
<input type="submit" value="Login">
</td>
</tr>

</table>


</form:form>

</body>
</html>