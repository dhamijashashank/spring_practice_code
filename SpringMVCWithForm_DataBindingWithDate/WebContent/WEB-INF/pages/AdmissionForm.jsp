<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>

<form action="/SpringMVCWithForm_DataBindingWithDate/submitForm.html"  method="post">
    Student Name:	<input type="text" name="studentName"><br>
    Student Hobby:  <input type="text" name="studentHobby"><br>
    Student Mobile:  <input type="text" name="studentMobile"><br>
    Student DOB:  <input type="text" name="studentDOB"><br>
    Student Skill Set:  <select name="studentSkill" multiple>
    						<option value="Core Java" >Core Java</option>
    						<option value="Spring Core" >Spring Core</option>
    						<option value="Spring MVC" >Spring MVC</option>
    						<option value="Hibernate" >Hibernate</option>
							</select>	
    <input type="submit" value="submit"><br>
</form>

</body>
</html>