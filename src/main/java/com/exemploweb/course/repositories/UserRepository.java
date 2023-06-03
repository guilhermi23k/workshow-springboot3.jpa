package com.exemploweb.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.exemploweb.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
