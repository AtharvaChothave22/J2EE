package com.demo.service;
import com.demo.dao.*;
import com.demo.model.*;

import java.util.List;
import java.util.Scanner;
public class ServiceImpl implements Iservice{
      //Idao edao=new DaoImpl();
	private Idao udao;

	public ServiceImpl() {
		udao=new DaoImpl();
	}
	public void AddnewUser() {
		
		System.out.println("In service method");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User id");
		int id=sc.nextInt();
		System.out.println("Enter User name");
		String name=sc.next();
		System.out.println("Enter User addressid");
		int addid=sc.nextInt();
		System.out.println("Enter User street");
		String street=sc.next();
		System.out.println("Enter User city");
		String city=sc.next();
		User u1=new User(id,name,new Address(addid,street,city));
		udao.save(u1);
	}
	public List<User> DisplayAll() {
		return udao.FindAll();
	}
	public boolean DeleteByid(int id) {
		boolean status=udao.DeletByID(id);
		return status;
	}

}
