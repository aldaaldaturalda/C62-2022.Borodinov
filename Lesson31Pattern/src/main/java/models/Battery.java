package models;

public class Battery implements FunctionImpl {

    public void getFunction() {
        System.out.println("Дай мне другую подзарядку для Android");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("Operation system for Battery");
    }

}
