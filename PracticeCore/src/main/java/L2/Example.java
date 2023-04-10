package L2;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class Example {
    @AllArgsConstructor
    static class Data {
        private Integer value;
        private String str;
        private Example example;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();//generics
        ArrayList<Data> listInteger = new ArrayList<>();
        listInteger.add(new Data(12, "234", new Example()));
        for (Data object : listInteger) {
            String str = object.str.trim();
        }
    }

}
