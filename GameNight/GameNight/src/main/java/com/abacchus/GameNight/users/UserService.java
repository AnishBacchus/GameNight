package com.abacchus.GameNight.users;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponseDTO createUser(UserCreateDTO userCreateDTO){
        User user = new User();

        user.setUsername(userCreateDTO.getUsername());
        user.setPassword(userCreateDTO.getPassword());
        user.setEmail(userCreateDTO.getEmail());
        userRepository.save(user);

        return toUserResponseDTO(user);
    }

    public UserResponseDTO toUserResponseDTO (User user){
        UserResponseDTO responseDTO = new UserResponseDTO();

        responseDTO.setId(user.getId());
        responseDTO.setUsername(user.getUsername());
        responseDTO.setEmail(user.getEmail());

        return responseDTO;
    }

    public UserResponseDTO getUser(Long id){
        Optional<User> findUser = userRepository.findById(id);

        if (findUser.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found");
        }
        User user = findUser.get();


        return toUserResponseDTO(user);
    }

}


