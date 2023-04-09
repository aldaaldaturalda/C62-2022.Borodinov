package by.tms.onlinestore.utils;

import by.tms.onlinestore.dto.UserDto;
import lombok.experimental.UtilityClass;

import java.util.Optional;

@UtilityClass
public class Utils {
    public static boolean isUserLogIn(UserDto userDto) {
        return Optional.ofNullable(userDto).isPresent();
    }
}
