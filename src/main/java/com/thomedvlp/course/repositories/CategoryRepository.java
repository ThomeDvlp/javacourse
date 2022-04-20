package com.thomedvlp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomedvlp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
