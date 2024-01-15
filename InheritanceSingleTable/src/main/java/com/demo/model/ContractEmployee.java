package com.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Contr11")
@DiscriminatorValue("ContractEmployee")
public class ContractEmployee extends Employee{
	private int hrs;
	private float rate;
	public ContractEmployee() {
		super();
	}
	public ContractEmployee(int eid, String ename, String job,int hrs, float rate) {
		super(eid, ename, job);
		this.hrs = hrs;
		this.rate = rate;
	}
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	@Override
	public String toString() {
		return "ContractEmployee [hrs=" + hrs + ", rate=" + rate + "]";
	}
	
	

}
