package com.demo.model;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="Perishable6")
public class PerishableProduct extends Product{
	private Date expirydate;

	public PerishableProduct() {
		super();
	}

	public PerishableProduct(int pid, String pname, Date mdate,Date expirydate) {
		super(pid, pname, mdate);
		this.expirydate = expirydate;
	}

	public Date getExpirydate() {
		return expirydate;
	}

	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

	@Override
	public String toString() {
		return "PerishableProduct [expirydate=" + expirydate + "]";
	}
	
	
}
