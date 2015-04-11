package com.classifieds.app.service.impl;

import com.classifieds.app.model.User;
import com.classifieds.app.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.classifieds.app.repository.UserRepository;

import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional
	public User save(User user) {
		return userRepository.save((User) user);
	}

	public boolean findByLogin(String userName, String password) {
		User stud = userRepository.findByUserName(userName);
		
		if(stud != null && stud.getPassword().equals(password)) {
			return true;
		} 
		
		return false;		
	}

	public boolean findByUserName(String userName) {
		User stud = userRepository.findByUserName(userName);
		
		if(stud != null) {
			return true;
		}
		
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = userRepository.getAllUsers();
		return users;
	}
}
