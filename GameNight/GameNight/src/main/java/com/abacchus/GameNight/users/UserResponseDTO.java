package com.abacchus.GameNight.users;

import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserResponseDTO {

    private long id;
    private String username;
    private String email;
}
