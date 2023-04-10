package models;

public class LifeCount implements FunctionImpl {
    public void getFunction() {
        System.out.println("Посмотри на счетчик!!!");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("Operation system for LifeCount");
    }

}
