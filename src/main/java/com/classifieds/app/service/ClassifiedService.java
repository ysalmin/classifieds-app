package com.classifieds.app.service;

import com.classifieds.app.model.Category;
import com.classifieds.app.model.Classified;
import com.classifieds.app.model.User;

import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
public interface ClassifiedService {

	User save(User user);

	boolean findByLogin(String userName, String password);

	boolean findByUserName(String userName);

	List<User> getAllUsers();

	List<Classified> getAllClassifieds();

	List<Classified> getClassifiedsByCategoryId(Long id);

	List<Category> getAllCategories();

	Classified getClassifiedById(Long id);

	Category getCategoryById(Long id);


}
