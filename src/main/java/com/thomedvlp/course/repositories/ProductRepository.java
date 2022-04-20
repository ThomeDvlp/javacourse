package com.thomedvlp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomedvlp.course.entities.Order;
import com.thomedvlp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
