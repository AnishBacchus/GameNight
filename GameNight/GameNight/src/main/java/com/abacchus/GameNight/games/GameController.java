package com.abacchus.GameNight.games;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @PostMapping("/add")
    public ResponseEntity<GameResponseDTO> addGame (@Valid @RequestBody GameCreateDTO gameDTO){
        GameResponseDTO game = gameService.createGame(gameDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(game);

    }
}
