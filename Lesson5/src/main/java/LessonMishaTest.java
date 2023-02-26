/*
Вывести колличество уникальных символов всех строк
List<String> strings = new ArrayList<>();
strings.add("qwerfg");
strings.add("asdfhj");
strings.add("zxcvfj");
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LessonMishaTest {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("qwerfg");
        strings.add("asdfhj");
        strings.add("bgbubilqelgvuiqa");
        strings.add("zxcvfjvvvvvvvvvvvvvvvvvvv");
        strings.stream()
                .map(s -> Arrays.stream(s.split("")).distinct().count())
                .forEach(System.out::println);
    }
}