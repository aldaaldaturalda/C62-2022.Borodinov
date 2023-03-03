package models;

public class Leg implements Function {

    @Override
    public void getFunction(String info) {
        if (info == null) {
            System.out.println("у кабана сосать нечего");
        } else {
            System.out.println("есть морковка у кабана");
        }

    }
}
