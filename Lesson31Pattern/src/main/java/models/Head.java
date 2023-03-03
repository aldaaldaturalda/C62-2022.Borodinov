package models;

public class Head implements FunctionImpl {
    public void getFunction() {
        System.out.println("О прикольно теперь и голова появилась!!!");
    }

    @Override
    public void getOperationSystem() {
        System.out.println("Operation system for Head");
    }
}
