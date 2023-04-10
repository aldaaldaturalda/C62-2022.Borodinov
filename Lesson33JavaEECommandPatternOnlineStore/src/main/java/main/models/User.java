package main.models;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@EqualsAndHashCode
@Getter
@Setter
@Builder
public class User {
    private Long id;
    private String login;
    private String password;
    private String name;
    private String surname;
    private String email;
    private Timestamp dateOfBirth;

    public User(String login) {
        this.login = login;
    }
}
