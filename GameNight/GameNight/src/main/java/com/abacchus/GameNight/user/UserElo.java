package com.abacchus.GameNight.user;

import com.abacchus.GameNight.game.Game;
import com.abacchus.GameNight.match.MatchResult;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserGameElo {

    private User user;
    private MatchResult matchResult;
    private Game game;

}
