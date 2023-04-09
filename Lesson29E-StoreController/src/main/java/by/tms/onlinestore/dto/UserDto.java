package by.tms.onlinestore.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@ToString
@SuperBuilder
public class UserDto {
    private String login;
    private String name;
    private String surname;
    private String sex;
    private String dateOfBirth;
    private String email;
    private String dateOfRegistry;
}
