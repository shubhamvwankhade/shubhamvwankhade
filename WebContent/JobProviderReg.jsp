<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Job Provider Register</title>
</head>
<body>
<h1>Job Provider Can Register Here</h1>


<form:form method="post" action="JobProviderReg">

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
<form:input path="jobName"/>
</td>
</tr>

<tr>
<td>
  Location :
</td>
<td>
<form:input path="location"/>
</td>
</tr>

<tr>
<td>
<input type="submit" value="Register"/>
</td>
</tr>

</table>

</form:form>

</body>
</html>