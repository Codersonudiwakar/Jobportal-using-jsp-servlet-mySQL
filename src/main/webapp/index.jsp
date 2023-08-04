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
            JobDAO jobdao=new JobDAO(DBConnect.getConn());
            List<Jobs> list=jobdao.getAllJobsUSer();

            for (Jobs j :list) {
            
        %>
      <div class="card" style="width:90%;  margin: 0 auto; /* Added */
        float: none; 
        margin-bottom: 10px;">
  <div class="card-body">
  <h2><%= j.getJobtitle() %></h2>
     <h5><%= j.getCompanyname() %></h5>
     <h5><%=j.getLocation() %></h5>
     <h5>Required Skills</h5>
      <p><%=j.getSkills()%></p>
   
    <a href="one-view.jsp?id=<%=j.getId() %>" class="btn btn-primary">View More</a>
    
  </div>
</div>
      <%}
 
 
 %>
  <%@include file="Allcomponent/footer.jsp" %>
</body>
</html>




