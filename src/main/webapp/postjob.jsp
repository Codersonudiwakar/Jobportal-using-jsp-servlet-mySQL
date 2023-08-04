    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"  %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Post jobs Page</title>
<%@include file="Allcomponent/allcss.jsp"%>
</head>
<body>
<%@include file="Allcomponent/navbar.jsp" %>

<c:if test="${not empty succmsg }">
<div class="alert alert-success" role="alert">
  ${ succMsg}
</div>
<c:remove var="succMsg"/>
</c:if>
<h1 style="text-align: center; margin-top: 30px" >Add Job</h1>

 <div class="signup-container">
 <form action="postjob" method="get">
  <label for="category"><b>Category</b></label>
           <select name="category">
           
			<option value="Software Development/Data science">Software/Data science</option>
			<option value="Marketing">Marketing</option>
			<option value="BPO calling">Inbound/Outbond</option>
			<option value="Managment">HR/Manager</option>
			
			
		</select>
		<br>
        <label for="job-title"><b>Job Title</b></label>
        <input type="text" placeholder="Enter Job title" name="jobtitle" required>
        
         <label for="location"><b>Location</b></label>
        <input type="text" placeholder="Enter location" name="location" required>
        
         <label for="CompanyName"><b>Company Name</b></label>
        <input type="text" placeholder="Enter Company Name" name="CompanyName" required>
        
		 <label for="skills"><b>Skills</b>
		</label>
        <input type="text" placeholder="Enter skills" name="skills" required>
        
         <label for="Jobdescription"><b>Job Description</b></label>
        <input type="text" minlength="200" placeholder="Enter Job Description" name="Jobdescription" required>
       
        <div class="clearfix">
            <button type="submit">Publish</button>


        </div>
 </form>

    </div>
 <%@include file="Allcomponent/footer.jsp" %>
</body>
</html>