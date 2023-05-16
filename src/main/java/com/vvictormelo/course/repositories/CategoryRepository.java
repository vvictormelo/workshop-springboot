package com.vvictormelo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vvictormelo.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
