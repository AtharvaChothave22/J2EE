package com.demo.model;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
@Entity
@Table(name="Emp19")
@Inheritance(strategy=InheritanceType.JOINED)
public class Employee { 
	@Id
	private int eid;
	private String ename;
	private String Job;
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, String job) {
		super();
		this.eid = eid;
		this.ename = ename;
		Job = job;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return Job;
	}
	public void setJob(String job) {
		Job = job;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", Job=" + Job + "]";
	}
	
	
}
