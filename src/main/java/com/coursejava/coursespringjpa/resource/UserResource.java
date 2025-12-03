package com.coursejava.coursespringjpa.resource;

import com.coursejava.coursespringjpa.models.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1, "Maria", "mariaxxz@gmail.com", "(00)1 1234-5678", "123");
        return ResponseEntity.ok().body(u);
    }
}
