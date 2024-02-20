package com.example.exmple2.Repository;

import com.example.exmple2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository <User,Long>{
    User findByEmail(String email);



}
