package com.fgn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fgn.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
