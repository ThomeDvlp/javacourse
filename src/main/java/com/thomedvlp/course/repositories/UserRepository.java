package com.thomedvlp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thomedvlp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
