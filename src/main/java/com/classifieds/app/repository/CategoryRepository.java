package com.classifieds.app.repository;

import com.classifieds.app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Query("select c from Category c")
    List<Category> getAllCategories();
}
