package com.fgn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fgn.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
