package homework.task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public enum FlowerType {
    ROSE("Роза", 15),
    LILY("Лилия", 33),
    ASTER("Астра", 34),
    GERBERA("Гербера", 19),
    TULIP("Тюльпаны", 31),
    CARNATION("Гвоздика", 23);
    private final String name;
    private final int price;

}
