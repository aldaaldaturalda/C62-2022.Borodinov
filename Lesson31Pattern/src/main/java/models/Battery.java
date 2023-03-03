package models;

public class Battery implements Function {
    @Override
    public void getFunction(String info) {
        if (info == null) {
            System.out.println("у совы сосут котята");
        } else {
            System.out.println("арбузная мята прогулялась по парку");
        }
    }
}
