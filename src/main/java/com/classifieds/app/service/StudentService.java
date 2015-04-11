package com.classifieds.app.service;

import com.classifieds.app.model.User;


import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
public interface StudentService {
	User save(User user);
	boolean findByLogin(String userName, String password);
	boolean findByUserName(String userName);
	List<User> getAllUsers();
}
