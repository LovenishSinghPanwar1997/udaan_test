package io.udaanTest.admin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="ADMIN_TABLE")
public class Admin {
	
	@Id
	@Column(name="UNAME")
	private String userName;
	
	@Column(name="UPASS")
	private String userPassword;

	public Admin(String userName, String userPassword) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
	}
	
	public Admin() {
		
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
}
