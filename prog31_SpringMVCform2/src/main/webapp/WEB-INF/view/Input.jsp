<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!--
	 when form is loaded,Spring MVC will bind the data by calling methods
	 obj.getTxt1(),obj.Txt2(),obj.getOp()
	 
	 when form is submitted,Spring MVC will bind the data by calling methods
	 obj.setTxt1(),obj.setTxt2(),obj.setOp()	
 -->

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form:form action="processing" modelAttribute="obj">
	Enter Your Name:
	<form:input path="nme" /><br><br>
	Enter Your Email:
	<form:input path="eml" /><br><br>
	Enter Your Password:
	<form:password path="pass" /><br><br>
	Enter Your Birthdate:
	<form:input path="bdte" /><br><br>
	Select Gender:
	<form:radiobutton path="gen" value="Male" label="Male" />
	<form:radiobutton path="gen" value="Female" label="Female"/><br><br>
	Select Your Hobbies:
	<form:checkbox path="hobby" value="Chess" label="Chess" />
	<form:checkbox path="hobby" value="Cricket" label="Cricket" />
	<form:checkbox path="hobby" value="Football" label="Football"/><br><br>
	Select Your Course:
	<form:select path="op">
			<form:option value="Java" label="Java" />
			<form:option value="PHP" label="PHP" />
			<form:option value="C++" label="C++" />
		</form:select>
	<br>
		<br>
		
		
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>