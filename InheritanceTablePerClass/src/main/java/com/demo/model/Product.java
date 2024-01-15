package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
@Entity
@Table(name="product6")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Product {
	@Id
	private int pid;
	private String pname;
	private Date mdate;
	public Product() {
		super();
	}
	public Product(int pid, String pname, Date mdate) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.mdate = mdate;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", mdate=" + mdate + "]";
	}
	
	

}
