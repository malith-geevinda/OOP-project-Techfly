package com.system.supplier;

public class supplier {


	String sid;
	String sname;
	String cname;
	String phone;
	String email;
	String password;
	
	public supplier(String sid, String sname, String cname, String phone, String email, String password) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cname = cname;
		this.phone = phone;
		this.email = email;
		this.password = password;
	}

	public String getSid() {
		return sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
