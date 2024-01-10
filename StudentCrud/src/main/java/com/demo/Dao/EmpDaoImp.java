package com.demo.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.ArrayList;

import com.demo.Models.Students;

public class EmpDaoImp implements IDaoEmp {
   static Connection conn;
   static PreparedStatement selemp,insertemp,updatemp,selectid,deleteid; 
   static {
	   conn=DbUtil.GetMyConnection();
	   try {
		   selemp=conn.prepareStatement("select * from employee1");
		   insertemp=conn.prepareStatement("insert into employee1 values(?,?,?,?)");
		   updatemp=conn.prepareStatement("Update employee1 set name=?,email=?,contact=? where id=?");
		   deleteid=conn.prepareStatement("delete from employee1 where id=?");
		   selectid=conn.prepareStatement("select * from employee1 where id=?");
	} catch (SQLException e) {
		e.printStackTrace();
	}
	   
   
   }
	public List<Students> DisplayEmp() {
		List<Students> lst=new ArrayList<>();
		try {
			ResultSet rs=selemp.executeQuery();
			while(rs.next())
			{
				Students e1=new Students(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
				lst.add(e1);
			}
			
		} catch (SQLException e) {
			
	         e.printStackTrace();
		}
		return lst;
	}
	public void InsertEmployee(Students s1) {
		try {
			insertemp.setInt(1,s1.getId());
			insertemp.setString(2,s1.getName());
			insertemp.setString(3,s1.getEmail());
			insertemp.setInt(4, s1.getContact());
			insertemp.executeUpdate();
		} catch (SQLException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public Students UpdateEmp(int id) {
		try {
			selectid.setInt(1, id);
			ResultSet rs=selectid.executeQuery();
			if(rs.next())
			{
			return new Students(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public void FindByid(Students s1) {
		try {
			
			
			updatemp.setString(1, s1.getName());
			updatemp.setString(2, s1.getEmail());
			updatemp.setInt(3, s1.getContact());
			updatemp.setInt(4, s1.getId());
			updatemp.executeUpdate();
			
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	@Override
	public void DeleteEmp(int id) {
	try {
		System.out.println(id);
		System.out.println("asdhuisdga");

		deleteid.setInt(1, id);
		deleteid.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	
}
