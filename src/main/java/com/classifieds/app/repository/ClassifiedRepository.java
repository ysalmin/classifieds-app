package com.classifieds.app.repository;

import com.classifieds.app.model.Classified;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Developer: YSalmin
 * Date: 11.04.2015
 */
@Repository("classifiedRepository")
public interface ClassifiedRepository extends JpaRepository<Classified, Long> {

    @Query("select c from Classified c")
    List<Classified> getAllClassifieds();

    @Query("select c from Classified c where c.id = :id")
    Classified getClassifiedById(@Param("id") Long id);
   /* from Cat as cat
    left join cat.kittens as kitten
    with kitten.bodyWeight > 10.0*/
    @Query("select c from Classified c join c.categories cat where cat.id = :id")
    List<Classified> getClassifiedsByCategoryId(@Param("id") Long id);



}