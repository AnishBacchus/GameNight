package com.abacchus.GameNight.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User createUser(UserCreateDTO userCreateDTO){
        User user = new User();

        user.setUsername(userCreateDTO.getUsername());
        user.setPassword(userCreateDTO.getPassword());
        user.setEmail(userCreateDTO.getEmail());

        userRepository.save(user);
        return user;
    }
}
