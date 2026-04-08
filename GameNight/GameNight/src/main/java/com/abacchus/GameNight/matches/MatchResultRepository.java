package com.abacchus.GameNight.matches;

import com.abacchus.GameNight.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MatchResultRepository extends JpaRepository <MatchResult, Long> {
    List<MatchResult> findByUserId(long userId);
    MatchResult findByUserIdAndMatchId(long userId, long matchId);
}
