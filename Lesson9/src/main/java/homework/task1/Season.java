package homework.task1;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public enum Season {
    WINTER(-5, "Я люблю зиму. Зимой можно кататься на санках, играть в снежки, получать подарки на Новый год"),
    SPRING(11, "Я люблю весну. Весной природа возрождается: набухают почки на деревьях, возвращаются птицы"),
    SUMMER(35, "Я люблю лето. Летом можно купаться в речке, поехать к бабушке в деревню. Летом классно") {
        @Override
        public String getDescription() {
            return "Теплое время года";
        }
    },
    AUTUMN(10, "Я люблю осень. Осенью нужно идти на учёбу в школу, с деревьев опадает листва, птицы улетают зимовать на юг")
            {
                @Override
                public String getDescription() {
                    return "Мокрая пора года";
                }
            };

    private final int temperature;
    private final String info;

    Season(int temperature, String info) {
        this.temperature = temperature;
        this.info = info;
    }

    public int getTemperature() {
        return temperature;
    }

    public String getInfo() {
        return info;
    }

    public String getDescription() {
        return "Холодное время года";
    }
}
