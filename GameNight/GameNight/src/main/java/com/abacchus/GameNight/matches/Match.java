package com.abacchus.GameNight.matches;

import com.abacchus.GameNight.games.Game;
import com.abacchus.GameNight.gamegroups.GameGroup;
import com.abacchus.GameNight.users.User;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@Table(name = "match")
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "match_creator_id")
    private User matchCreator;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private GameGroup gameGroup;

    @ManyToOne
    @JoinColumn(name = "game_played")
    private Game game;

    private LocalDateTime playedAt;
    private boolean isDisputed;
}
