package com.sowmya.web2.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class Register 
{
	@Id
private String userName;
	@Column
private String dateOfBirth;
	@Column
private String email;
	@Column
private int mobileNo;
	@Column
private String address;
	@Column
private String passWord;
	
	@Column
	private String role;
	
	@Column
	private boolean enabled;
	
	
	
public boolean getEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(String dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public int getMobileNo() {
	return mobileNo;
}
public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}

}
