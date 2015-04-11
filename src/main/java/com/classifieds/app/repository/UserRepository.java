package com.classifieds.app.repository;

import com.classifieds.app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select s from User s where s.userName = :userName")
	User findByUserName(@Param("userName") String userName);

	@Query("select s from User s")
	List<User> getAllUsers();
	
}
