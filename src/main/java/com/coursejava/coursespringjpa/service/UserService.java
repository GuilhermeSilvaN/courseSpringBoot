package com.coursejava.coursespringjpa.service;

import com.coursejava.coursespringjpa.models.User;
import com.coursejava.coursespringjpa.record.UserRecordDto;
import com.coursejava.coursespringjpa.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

//registro de service component
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
    }

    @Transactional
    public User saveUser(UserRecordDto userRecordDto){
        User user = new User();
        user.setName(userRecordDto.name());
        user.setEmail(userRecordDto.email());
        user.setPhone(userRecordDto.phone());
        user.setPassword(userRecordDto.password());

        return userRepository.save(user);
    }

    @Transactional
    public User insert (User user){
        return userRepository.save(user);
    }
}
