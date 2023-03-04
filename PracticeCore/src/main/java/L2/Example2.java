package L2;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Example2 {
    public static void main(String[] args) {
        List<String> objects = new ArrayList<>();
        objects.add("dada");
        objects.add("22");
        objects.add("2323");
        objects.add("33");
        objects.add("55");
        String oldValue = objects.set(2, "Никитос");//достать значение и заменить из массива
        System.out.println(oldValue);
        System.out.println(objects);
    }
}