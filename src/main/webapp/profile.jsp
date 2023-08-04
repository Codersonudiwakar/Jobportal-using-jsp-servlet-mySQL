<%@page import="com.dao.UserDAO"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="com.entity.Jobs"%>
<%@page import="java.util.List"%>
<%@page import="com.database.DBConnect"%>
<%@page import="com.dao.JobDAO"%>
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
    
        <%
        if(user!=null){
        UserDAO userdao=new UserDAO(DBConnect.getConn());
        User user1=userdao.getUserByName("email");
        }
        %>
   
        
        
<h2 style="text-align:center">Your Profile Details</h2>

<div class="pcard">
  <img src="img/user-pic.png" style="width:40%; margin-left: auto;margin-right: auto;border-radius:50%">
  <h1>Name : <%=user.getName() %></h1>
  <p >Email : <%=user.getEmail() %></p>
  <p >Phone : <%=user.getPhone() %></p>
  <p> Gender : <%=user.getGender() %></p>
  <p>Qualification : <%=user.getQualification()%></p>
  <p>City : <%=user.getCity()%></p>
  <p>Role : <%=user.getRole()%></p>
  <!-- <p><button>Contact</button></p> -->
</div>
        
  <%@include file="Allcomponent/footer.jsp" %>
</body>
</html>




