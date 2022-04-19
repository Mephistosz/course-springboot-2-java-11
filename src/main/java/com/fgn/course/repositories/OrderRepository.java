package com.fgn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fgn.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
