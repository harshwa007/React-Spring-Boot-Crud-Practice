package com.harsh.fullstackbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.harsh.fullstackbackend.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
