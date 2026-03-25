package entities;
import jakarta.persistence.Entity;

@Entity
public class User {
    private String name;
    private String email;
    private String password;
}
