package com.demo.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Wageemp")
@DiscriminatorValue("WageEmployee")
public class WageEmployee extends Employee{
	private float salary;

	public WageEmployee() {
		super();
	}

	public WageEmployee(int eid,String ename, String job,float salary ) {
		super(eid, ename, job);
		this.salary = salary;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "WageEmployee [salary=" + salary + "]";
	}
	

}
