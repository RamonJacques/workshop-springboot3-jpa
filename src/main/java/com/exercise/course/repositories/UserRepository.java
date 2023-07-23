package com.exercise.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exercise.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
