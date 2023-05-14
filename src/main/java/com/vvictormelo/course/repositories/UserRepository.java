package com.vvictormelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvictormelo.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
