package com.abacchus.GameNight.games;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameCreateDTO {

    @NotBlank
    private String name;

    @NotBlank
    private String category;

    @NotBlank
    private String description;
}
