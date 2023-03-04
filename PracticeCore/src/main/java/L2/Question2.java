package L2;

import java.util.List;
import java.util.stream.Collectors;

// Сделать вывод в формате: число из списка + "-Hello" и то, сколько раз это число встречалось в списке, при этом не делать вывод для 4 и 6
// List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
public class Question2 {
    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 5, 4, 4, 5, 2, 3, 6, 5);
        integers.stream()
                .filter(i -> i != 4 & i != 6)
                .collect(Collectors.groupingBy(key -> key + "-Hello", Collectors.counting()))
                .forEach((key, val) -> System.out.println(key + " : " + val));
    }
}
