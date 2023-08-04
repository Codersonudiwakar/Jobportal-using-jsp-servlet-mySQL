package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.JobDAO;
import com.database.DBConnect;
import com.entity.Jobs;

@WebServlet("/postjob")
public class AddJobServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String category=req.getParameter("category");
			String jobtitle=req.getParameter("jobtitle");
			String location=req.getParameter("location");
			String companyname=req.getParameter("CompanyName");
			String skills=req.getParameter("skills");
			String jobdescription=req.getParameter("Jobdescription");
			
			Jobs j=new Jobs();
			j.setCategory(category);
			j.setJobtitle(jobtitle);
			j.setLocation(location);
			j.setCompanyname(companyname);
			j.setSkills(skills);
			j.setJobdescription(jobdescription);
			
			
			HttpSession session=req.getSession();
			JobDAO jobdao=new JobDAO(DBConnect.getConn());
			boolean f=jobdao.addJobs(j);
			if (f) {
				session.setAttribute("succMsg","job post Sucessfully........");
				resp.sendRedirect("postjob.jsp");
				
			}
			else {
				session.setAttribute("succMsg","somthing went wrong");
				resp.sendRedirect("postjob.jsp");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
	

}
