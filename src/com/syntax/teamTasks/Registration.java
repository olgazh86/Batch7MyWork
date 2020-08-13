package com.syntax.teamTasks;

public class Registration {
	
	private String email, userName, password;
	
	//setting
	public void setEmail(String email) {
		if (email.contains("yahoo")) {
		this.email = email;
		}
	}
	
	public void setUserName(String userName) {
		if(userName.isEmpty()&& userName.length()>6) {
			}else {
		this.userName =userName;
		}
	}
	
	public void setPassword(String password) {
		if(password.length()>6 && !password.isEmpty()&& !password.contains(userName)) {
		}
		this.password = password;
	}
	
	//getting
	
	public String getEmail() {
			return email;
	}
	public String getUserName() {
		return userName;
}
	public String getPassword() {
		return password;
}

}
