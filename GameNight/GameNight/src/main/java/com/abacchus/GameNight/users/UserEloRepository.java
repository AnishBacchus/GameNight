package com.abacchus.GameNight.users;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserEloRepository extends JpaRepository <UserElo, Long>  {
    List<UserElo> findByGameIdAndEloRatingOrderByDesc(Long gameId);
}
