package com.abacchus.GameNight.users;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateDTO {

    @NotBlank
    private String username;

    @NotBlank
    @Size(min = 5, max = 30)
    private String password;

    @Email
    private String email;
}
