package com.coursejava.coursespringjpa.controller;

import com.coursejava.coursespringjpa.models.User;
import com.coursejava.coursespringjpa.record.UserRecordDto;
import com.coursejava.coursespringjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public ResponseEntity<List<User>> findAll() {

        return ResponseEntity.ok().body(userService.findAll());
    }

    @GetMapping(value="/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User user = userService.findById(id);

        return ResponseEntity.ok().body(user);
    }

    @PostMapping
    public ResponseEntity<String> saveUser(@RequestBody UserRecordDto userRecordDto){
        userService.saveUser(userRecordDto);

        return ResponseEntity.ok("save successful");
    }
}
