package com.system.Payment;

public class payment {

	private String cardnumber;
	private String cardtype;
	private String exmonth;
	private String exyear;
	private String cvv;
	private String email;
	private String name;
	private String password;
	
	public payment(String cardnumber, String cardtype, String exmonth, String exyear, String cvv, String email,
			String name, String password) {
		super();
		this.cardnumber = cardnumber;
		this.cardtype = cardtype;
		this.exmonth = exmonth;
		this.exyear = exyear;
		this.cvv = cvv;
		this.email = email;
		this.name = name;
		this.password = password;
	}

	public String getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String cardnumber) {
		this.cardnumber = cardnumber;
	}

	public String getCardtype() {
		return cardtype;
	}

	public void setCardtype(String cardtype) {
		this.cardtype = cardtype;
	}

	public String getExmonth() {
		return exmonth;
	}

	public void setExmonth(String exmonth) {
		this.exmonth = exmonth;
	}

	public String getExyear() {
		return exyear;
	}

	public void setExyear(String exyear) {
		this.exyear = exyear;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
