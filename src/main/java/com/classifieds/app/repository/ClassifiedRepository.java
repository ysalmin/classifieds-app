package com.classifieds.app.repository;

import com.classifieds.app.model.Classified;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
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



}