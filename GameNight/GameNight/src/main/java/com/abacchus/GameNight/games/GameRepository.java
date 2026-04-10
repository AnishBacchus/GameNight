package com.abacchus.GameNight.games;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GameRepository extends JpaRepository <Game, Long> {
    List<Game> findByGameName(String gameName);
    List<Game> findByGameCategory(String category);
}
