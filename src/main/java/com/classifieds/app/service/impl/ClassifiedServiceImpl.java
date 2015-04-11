package com.classifieds.app.service.impl;

import com.classifieds.app.model.Category;
import com.classifieds.app.model.Classified;
import com.classifieds.app.model.User;
import com.classifieds.app.repository.CategoryRepository;
import com.classifieds.app.repository.ClassifiedRepository;
import com.classifieds.app.repository.UserRepository;
import com.classifieds.app.service.ClassifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Service("studentService")
public class ClassifiedServiceImpl implements ClassifiedService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private ClassifiedRepository classifiedRepository;

	@Autowired
	private CategoryRepository categoryRepository;
	
	@Transactional
	public User save(User user) {
		return userRepository.save((User) user);
	}

	public boolean findByLogin(String userName, String password) {
		User stud = userRepository.findByUserName(userName);
		return stud != null && stud.getPassword().equals(password);
	}

	public boolean findByUserName(String userName) {
		User stud = userRepository.findByUserName(userName);
		return stud != null;
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}

	@Override
	public List<Classified> getAllClassifieds() {
		return classifiedRepository.getAllClassifieds();
	}

	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.getAllCategories();
	}
}
