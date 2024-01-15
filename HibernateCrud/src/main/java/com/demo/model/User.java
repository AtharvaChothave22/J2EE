package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user12")
public class User {
	@Id
	private int uid;
	private String uname;
	@Embedded
	private Address add;
	public User() {
		super();
	}
	public User(int uid, String uname, Address add) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.add = add;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", add=" + add + "]";
	}
	
}
