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

@WebServlet("/SignupServlet")
public class SignupServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		
		String name=req.getParameter("name");
		String gender=req.getParameter("Gender");
		String phone=req.getParameter("phone"); 
		String email=req.getParameter("email");
		String qulification=req.getParameter("qulification"); 
		String city=req.getParameter("city");
		String password=req.getParameter("password");
		
	UserDAO userdao=new UserDAO(DBConnect.getConn());	
	User user=new User(name, gender, phone, email, qulification, city, password,"role");
	boolean f=userdao.addUser(user);
	
	HttpSession session=req.getSession();
	if (f) {
		session.setAttribute("massage", "Registration Done");
		resp.sendRedirect("login.jsp");
		
	}
	else {
		session.setAttribute("succMsg", "somthing went wrong");
		resp.sendRedirect("signup.jsp");
	}
	
		
	} catch (Exception e) {
		// TODO: handle exception
	}
		
		
		
		}

}
