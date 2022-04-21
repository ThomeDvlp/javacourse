package com.thomedvlp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomedvlp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
