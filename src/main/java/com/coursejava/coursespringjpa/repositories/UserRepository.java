package com.coursejava.coursespringjpa.repositories;

import com.coursejava.coursespringjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    
}
