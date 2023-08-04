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
       int id = Integer.parseInt(request.getParameter("id"));
            JobDAO jobdao=new JobDAO(DBConnect.getConn());
            Jobs j=jobdao.getJobById(id);
        %>
        
     
       <div class="job">
     <h2 style="margin: 10px 50px" ><%= j.getJobtitle() %></h2>
     <h5 style="margin: 15px 50px">Company Name : <%=j.getCompanyname() %></h5>
      <h5 style="margin: 15px 50px">Location : <%=j.getLocation() %></h5>
      <h5 style="margin: 15px 50px">Qualification : <% %></h5>
      <h5 style="margin: 15px 50px">Required Skills</h5>
      <p style="margin: 15px 50px"><%=j.getSkills()%></p>
      <h5 style="margin: 15px 50px">Job Description</h5>
      <p style="margin: 15px 50px"><%=j.getJobdescription() %></p>
          <a href="#" class="btn btn-primary">Apply Now</a>
      
    </div>
        
        
  <%@include file="Allcomponent/footer.jsp" %>
</body>
</html>




