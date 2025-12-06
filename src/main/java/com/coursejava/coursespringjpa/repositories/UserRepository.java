package com.coursejava.coursespringjpa.repositories;

import com.coursejava.coursespringjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository (opcional) //registro de componente
public interface UserRepository extends JpaRepository<User,Long> {
    
}
