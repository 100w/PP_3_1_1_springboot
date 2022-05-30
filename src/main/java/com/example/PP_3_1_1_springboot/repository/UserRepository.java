package com.example.PP_3_1_1_springboot.repository;

import com.example.PP_3_1_1_springboot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
