package com.fgn.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fgn.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
