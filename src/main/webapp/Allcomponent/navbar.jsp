
<%@page import="com.entity.User"%>
<ul>

  <li><a href=""> <span style="font-size: 25px; margin-right: 15px;">Job Portal</span></a></li>
  <li><a href="home.jsp">Home</a></li>
  <li style="float:left;"><a class="active" href="view-jobs.jsp"><button style="border-radius: 10px; width: auto;">View Jobs</button></a></li>
	    <li style="float:left;"><a class="active" href="postjob.jsp"><button style="border-radius: 10px; width: auto;">Post Jobs</button></a></li>
	  
  <% User user=(User) session.getAttribute("userobj");
  
  if(user==null){ %>
	 <li style="float:right ;"><a class="active" href="login.jsp"><button style="border-radius: 10px; width: auto;">Login</button></a></li>
	    <li style="float:right;"><a class="active" href="signup.jsp"><button style="border-radius: 10px; width: auto;">SignUp</button></a></li>
	  
	  
 <%  } else {%>
 
  <li style="float:right"><a class="active" href="profile.jsp?name=<%=user.getName() %>"><button><%=user.getName() %></button></a></li>
    <li style="float:right"><a class="active" href="logout"><button>Logout</button></a></li>
  
	 	
 <% }%>
  <!-- <li style="float:right"><a class="active" href="login.jsp"><button>Login</button></a></li>
    <li style="float:right"><a class="active" href="signup.jsp"><button>Signup</button></a></li>
   -->
</ul>