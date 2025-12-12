package com.coursejava.coursespringjpa.repositories;

import com.coursejava.coursespringjpa.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Repository (deve ser registrado) //registro de componente

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    
}
