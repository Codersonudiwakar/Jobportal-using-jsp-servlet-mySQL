package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Jobs;

public class JobDAO {
	private Connection conn;

	public JobDAO(Connection conn) {
		super();
		this.conn = conn;
	}
	public boolean addJobs(Jobs j) {
		boolean f=false;
		try {
			String quary1="insert into jobs(category,jobtitle,location,companyname,skills,jobdescription) values(?,?,?,?,?,?)";
			
			PreparedStatement ps=conn.prepareStatement(quary1);
			ps.setString(1, j.getCategory());
			ps.setString(2, j.getJobtitle());
			ps.setString(3, j.getLocation());
			ps.setString(4, j.getCompanyname());
			ps.setString(5, j.getSkills());
			ps.setString(6, j.getJobdescription());
			int i=ps.executeUpdate();
			
			if (i==1) {
				f=true;
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return f;
	}
	public List<Jobs> getAllJobs(){
		List<Jobs> list=new ArrayList<Jobs>();
		Jobs j=null;
		try {
			String quary="select *from jobs order by id desc";
			PreparedStatement ps=conn.prepareStatement(quary);
			ResultSet rs=ps.executeQuery();
			 while (rs.next()) {
				 j=new Jobs();
				 j.setId(rs.getInt(1));
				 j.setCategory(rs.getString(2));
				 j.setJobtitle(rs.getString(3));
				 j.setLocation(rs.getString(4));
				 j.setCompanyname(rs.getString(5));
				 j.setSkills(rs.getString(6));
				 j.setJobdescription(rs.getString(7));
				 j.setPostdate(rs.getTimestamp(8)+"");
				 list.add(j);
					
				
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return list;
	}
	
	public List<Jobs> getAllJobsUSer(){
		List<Jobs> list=new ArrayList<Jobs>();
		Jobs j=null;
		try {
			String quary="SELECT * FROM jobs";
			PreparedStatement ps=conn.prepareStatement(quary);
			//ps.setString(1);
			ResultSet rs=ps.executeQuery();
			 while (rs.next()) {
				 j=new Jobs();
				 j.setId(rs.getInt(1));
				 j.setCategory(rs.getString(2));
				 j.setJobtitle(rs.getString(3));
				 j.setLocation(rs.getString(4));
				 j.setCompanyname(rs.getString(5));
				 j.setSkills(rs.getString(6));
				 j.setJobdescription(rs.getString(7));
				 j.setPostdate(rs.getTimestamp(8)+"");
				 list.add(j);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

public Jobs getJobById(int id) { 
		Jobs j = null;
try {
	String sql ="select *from jobs where id=?";
	PreparedStatement ps= conn.prepareStatement(sql);

	ps.setInt(1, id);

	ResultSet rs=ps.executeQuery();
	while (rs.next()) {
	 j=new Jobs();
	 j.setId(rs.getInt(1));
	 j.setCategory(rs.getString(2));
	 j.setJobtitle(rs.getString(3));
	 j.setLocation(rs.getString(4));
	 j.setCompanyname(rs.getString(5));
	 j.setSkills(rs.getString(6));
	 j.setJobdescription(rs.getString(7));
	 j.setPostdate(rs.getTimestamp(8)+"");

	}
	}

	catch (Exception e) { e.printStackTrace();

	}
return j;
	}	
	

}
	