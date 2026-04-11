package com.abacchus.GameNight.matches;

import com.abacchus.GameNight.gamegroups.GameGroup;
import com.abacchus.GameNight.games.Game;
import com.abacchus.GameNight.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchPlayedRepository extends JpaRepository <MatchPlayed, Long> {

    List<MatchPlayed> findByMatchCreator(User matchCreator);
    List<MatchPlayed> findByGameGroup(GameGroup gameGroup);
    List<MatchPlayed> findByGame(Game game);
    List<MatchPlayed> findByGameGroupAndIsDisputed(GameGroup gameGroup, Boolean isDisputed);
}
