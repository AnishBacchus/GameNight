package com.abacchus.GameNight.games;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameResponseDTO createGame(GameCreateDTO gameCreateDTO){
        Game game = new Game();

        game.setName(gameCreateDTO.getName());
        game.setCategory(gameCreateDTO.getCategory());
        game.setDescription(gameCreateDTO.getDescription());
        gameRepository.save(game);

        return toGameResponseDTO(game);

    }

    public GameResponseDTO toGameResponseDTO(Game game){
        GameResponseDTO gameResponseDTO = new GameResponseDTO();

        gameResponseDTO.setName(game.getName());
        gameResponseDTO.setCategory(game.getCategory());
        gameResponseDTO.setDesc(game.getDescription());

        return gameResponseDTO;
    }
}
