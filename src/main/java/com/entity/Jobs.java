package com.entity;

public class Jobs {
	private int id;
	private String category;
	private String jobtitle;
	private String location;
	private String companyname;
	private String skills;
	private String jobdescription;
	private String postdate;
	public Jobs() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Jobs(String category, String jobtitle, String location, String companyname, String skills,
			String jobdescription, String postdate) {
		super();
		this.category = category;
		this.jobtitle = jobtitle;
		this.location = location;
		this.companyname = companyname;
		this.skills = skills;
		this.jobdescription = jobdescription;
		this.postdate = postdate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String getJobdescription() {
		return jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		this.jobdescription = jobdescription;
	}
	public String getPostdate() {
		return postdate;
	}
	public void setPostdate(String postdate) {
		this.postdate = postdate;
	}
	@Override
	public String toString() {
		return "Jobs [id=" + id + ", category=" + category + ", jobtitle=" + jobtitle + ", location=" + location
				+ ", companyname=" + companyname + ", skills=" + skills + ", jobdescription=" + jobdescription
				+ ", postdate=" + postdate + "]";
	}
	

}
