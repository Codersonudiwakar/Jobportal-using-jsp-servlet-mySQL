package com.dao;

import java.sql.*;

import com.entity.Jobs;
import com.entity.User;

public class UserDAO {
	private Connection conn;

	public UserDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addUser(User user) {
		boolean f=false;
		try {
			
			String quary="insert into user(name,gender,phone,email,qualification,city,password,role) values(?,?,?,?,?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(quary);
			ps.setString(1, user.getName());
			ps.setString(2, user.getGender());
			ps.setString(3, user.getPhone());
			ps.setString(4, user.getEmail());
			ps.setString(5, user.getQualification());
			ps.setString(6, user.getCity());
			ps.setString(7, user.getPassword());
			ps.setString(8, "user");
			int i=ps.executeUpdate();
			if (i==1) {
				f=true;
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
		
	}
	
	
	public User login(String em, String pass) {
		
		User user=null;
try {
			
			String quary="select * from user where email=? and password=?";
			PreparedStatement ps=conn.prepareStatement(quary);
			ps.setString(1, em);
			ps.setString(2, pass);
			ResultSet rs=ps.executeQuery();
			
			while (rs.next()) {
				user=new User();
				user.setId(rs.getInt(1));
				user.setName(rs.getString(2));
				user.setGender(rs.getString(3));
				user.setPhone(rs.getString(4));
				user.setEmail(rs.getString(5));
				user.setQualification(rs.getString(6));
				user.setCity(rs.getString(7));
				user.setPassword(rs.getString(8));
				user.setRole(rs.getString(9));
				
			}
			
				
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
		
		
	}
	
	public User getUserByName(String email) { 
		User u = null;
try {
	String sql ="select *from user where email=? and name=?";
	PreparedStatement ps= conn.prepareStatement(sql);

	ps.setString(1, email);

	ResultSet rs=ps.executeQuery();
	while (rs.next()) {
		u=new User();
		u.setId(rs.getInt(1));
		u.setName(rs.getString(2));
		u.setGender(rs.getString(3));
		u.setPhone(rs.getString(4));
		u.setEmail(rs.getString(5));
		u.setQualification(rs.getString(6));
		u.setCity(rs.getString(7));
		u.setPassword(rs.getString(8));
		u.setRole(rs.getString(9));
	}
	}

	catch (Exception e) { e.printStackTrace();

	}
return u;
	}	
	

}
