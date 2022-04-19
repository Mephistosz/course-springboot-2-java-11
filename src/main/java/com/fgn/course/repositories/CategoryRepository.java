package com.fgn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fgn.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
