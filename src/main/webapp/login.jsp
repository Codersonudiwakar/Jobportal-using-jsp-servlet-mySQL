<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<%@include file="Allcomponent/allcss.jsp"%>
</head>
<body>
<%@include file="Allcomponent/navbar.jsp" %>
<h1 style="text-align: center; margin-top: 30px" >Login</h1>

<%-- <h2 >${message}</h2> --%>
 <div class="login-container">
      
      <form Action="LoginServlet">
        <label for="email"><b>Email</b></label>
        <input type="text" placeholder="Enter Email" name="email" required>
    
        <label for="password"><b>Password</b></label>
        <input type="password" placeholder="Enter Password" name="password" required>
    
        <div class="clearfix">
          <button type="submit" value="submit">Login</button>
          <a href="signup.jsp"><button>Register</button>
          </a>
        </div>
        </form>
      </div>
 <%@include file="Allcomponent/footer.jsp" %>
</body>
</html>