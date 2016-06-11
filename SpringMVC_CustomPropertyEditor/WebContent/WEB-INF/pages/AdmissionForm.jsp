<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admission Form</title>
</head>
<body>
 
 <form:errors path="studentobj.*" />
 
      
  <form action="/SpringMVC_CustomPropertyEditor/submitForm1.html"  method="post">
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
		
		<br>					
	 Student Address: 
	 <br>
	  Country : <input type="text" name="studentAddress.country"><br>
	  City : <input type="text" name="studentAddress.city"><br>
	  Street :<input type="text" name="studentAddress.street"><br>
	  Pincode : <input type="text" name="studentAddress.pincode"><br>						
    <input type="submit" value="submit"><br>
</form>

</body>
</html>