package L2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
 попробуй создать чайник, в который ты отправляешь воду, листья чая, мед, лимон и получаешь чай
 */
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Kettle {
    private String water;
    private String leaves;
    private String med;
    private String lemon;

    public static void main(String[] args) {
//        Kettle kettle = new Kettle("voda", "zelenie","vkysni","kisli");
        getTea("GreenField");
//        getTea("teasty tea", "Greenfield");
    }

    private static void getTea(String nameOfTea) {
        Kettle kettle2 = new Kettle("voda", "zelenie", "vkysni", "kisli");
        System.out.println(kettle2);

    }
}
