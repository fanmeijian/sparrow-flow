package cn.youwei.flow.model;

import java.io.Serializable;

public class TrialApply implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5188574359984017236L;
	private String name;
	private String email;
	private String company;
	private String mobile;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	
	
}
