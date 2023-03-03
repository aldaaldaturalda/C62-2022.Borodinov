package models;

public class LifeCount implements Function {
    @Override
    public void getFunction(String info) {
        if (info == null) {
            System.out.println("выжить любой ценой");
        } else {
            System.out.println("остаться в живых в РБ + сосен мэсон");
        }

    }
}
