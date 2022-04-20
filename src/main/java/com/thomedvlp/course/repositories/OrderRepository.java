package com.thomedvlp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomedvlp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
