package models;

public class Leg implements FunctionImpl {

    public void getFunction() {
        System.out.println("Ура у меня есть ноги!!!");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("Operation system for Leg");
    }
}
