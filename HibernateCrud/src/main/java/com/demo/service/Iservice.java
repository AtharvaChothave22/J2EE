package com.demo.service;

import java.util.List;

import com.demo.model.User;

public interface Iservice {

	void AddnewUser();

	List<User> DisplayAll();

	boolean DeleteByid(int id);

}
