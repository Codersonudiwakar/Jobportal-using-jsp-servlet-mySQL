    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page isELIgnored="false"  %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="Allcomponent/allcss.jsp"%>
</head>
<body>
<%@include file="Allcomponent/navbar.jsp" %>
<h1 style="text-align: center; margin-top: 30px" >Registration </h1>

<c:if test="${not empty succmsg }">
<h4 class="text-center text-success"><p>${message}</p></h4>
  <c:remove var="succMsg"/>
 </c:if>

 <div class="signup-container">
       <form action="SignupServlet" method="get">
        <label for="username"><b>Name</b></label>
        <input type="text" placeholder="Enter your name" name="name" required>
        <p><b>Gender</b></p>
          <input type="radio" id="html" name="Gender" value="male">
          <label for="male">Male</label><br>
          <input type="radio" id="css" name="Gender" value="female">
          <label for="female">Female</label><br>
          <input type="radio" id="javascript" name="Gender" value="other">
          <label for="Others">Others</label>

<br>
        <label for="phone"><b>Phone Number</b></label>
        <input type="text" placeholder="Enter Phone Number" name="phone" required>

        <label for="email"><b>Email</b></label>
        <input type="email" placeholder="Enter Email" name="email" required>
        
         <label for="qulification"><b>Qulification</b></label> <br>
         <input
			type="checkbox"  name="qulification" value="10th">
			 <label for="qulification">10th</label><br>
			 <input type="checkbox"  name="qulification" value="12th">
			 <label for="qulification">12th</label><br> 
			<input type="checkbox" name="qulification" value="Graduation"> 
			
			<label for="qulification"> Graduation </label><br>
			<input type="checkbox" name="qulification" value="Master's Degree"> 
			<label for="qulification"> Master's Degree </label><br> <br> 

        <label for="city"><b>City</b></label>
        <input type="text" placeholder="Enter City" name="city" required>

        <label for="confirm-password"><b>Confirm Password</b></label>
        <input type="password" placeholder="Confirm Password" name="password" required>

        <div class="clearfix">
            <button type="submit">Register</button>
           <a href="Login.html"> <button>Login</button></a>

        </div>
       </form>
    </div>
 <%@include file="Allcomponent/footer.jsp" %>
</body>
</html>