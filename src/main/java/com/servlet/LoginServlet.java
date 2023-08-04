package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.UserDAO;
import com.database.DBConnect;
import com.entity.User;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String email = req.getParameter("email");
			String password = req.getParameter("password");
			User U = new User();
			HttpSession session = req.getSession();
			if ("admin@gmail.com".equals(email) && "admin@123".equals(password)) {
				session.setAttribute("userobj", U);
				U.setRole("admin");
				resp.sendRedirect("admin.jsp");
			
			}
			 else {
					
					UserDAO userdao=new UserDAO(DBConnect.getConn());
					User user=userdao.login(email, password);
				
			
			
		  	if (user !=null) {
				
				session.setAttribute("userobj", user);
				user.setRole("user");
				resp.sendRedirect("home.jsp");
			}
		  	else {
		  		session.setAttribute("massage", "invelid email or Password");
				resp.sendRedirect("login.jsp");
				
			}
		  	}
			

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub

	}

}
