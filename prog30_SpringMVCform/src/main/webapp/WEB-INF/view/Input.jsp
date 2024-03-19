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
	First Number:
	<form:input path="txt1" />
	Secound Number:
	<form:input path="txt2" />
		<br>
		<br>
	Select Operation:
	<form:select path="op">
			<form:option value="add" label="Addition" />
			<form:option value="sub" label="SubStraction" />
			<form:option value="mul" label="Multiplication" />
			<form:option value="div" label="Division" />
		</form:select>
		<br>
		<input type="submit" value="Submit">
	</form:form>

</body>
</html>