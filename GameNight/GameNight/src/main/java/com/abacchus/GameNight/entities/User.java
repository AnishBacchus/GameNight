package com.abacchus.GameNight.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String username;
    private String email;
    private String password;

    @CreationTimestamp
    private LocalDateTime accountCreationDate;

    @ManyToMany(mappedBy = "users")
    private List<GameGroup> groups = new ArrayList<>();

}
