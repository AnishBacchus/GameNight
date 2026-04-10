package com.abacchus.GameNight.gamegroups;

import com.abacchus.GameNight.users.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface GameGroupRepository extends JpaRepository <GameGroup, Long> {
    Optional<GameGroup> findByGroupName(String groupName);
    List<GameGroup> findByGroupOwner(User owner);
}
