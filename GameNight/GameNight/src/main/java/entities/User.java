package entities;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {

    
    private long id;

    private String name;
    private String email;
    private String password;
}
