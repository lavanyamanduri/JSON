package com.Model;

public class User {
	private String email;
	private String password;
	private String firstname;
	private String Dob;
	private String address;
	private String  phoneno;
	private String zip;
	private String lastname;

	public User() {
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

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getDob() {
		return Dob;
	}

	public void setDob(String dob) {
		Dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "User [email=" + email + ", password=" + password + ", firstname=" + firstname + ", Dob=" + Dob
				+ ", address=" + address + ", phoneno=" + phoneno + ", zip=" + zip + ", lastname=" + lastname + "]";
	}

	
}
