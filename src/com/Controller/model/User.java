package com.Controller.model;

public class User {
private String userid;
private String pass;
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public User(String userid, String pass) {
	super();
	this.userid = userid;
	this.pass = pass;
}

public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [userid=" + userid + ", pass=" + pass + "]";
}


}
