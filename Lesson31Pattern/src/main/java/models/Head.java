package models;

public class Head implements CreateRobokopFactoryImpl {
    public void getFunction(String info) {
        if (info == null) {
            System.out.println("у птички  нет яичек");
        } else {
            System.out.println("есть яичко у орленка");
        }

    }
}
