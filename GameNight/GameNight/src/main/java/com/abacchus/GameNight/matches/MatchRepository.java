package com.abacchus.GameNight.matches;

import com.abacchus.GameNight.gamegroups.GameGroup;
import com.abacchus.GameNight.games.Game;
import com.abacchus.GameNight.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchRepository extends JpaRepository <Match, Long> {

    List<Match> findByMatchCreator(User matchCreator);
    List<Match> findByGameGroup(GameGroup gameGroup);
    List<Match> findByGame(Game game);
    List<Match> findByGameGroupAndIsDisputed(GameGroup gameGroup, Boolean isDisputed);
}
