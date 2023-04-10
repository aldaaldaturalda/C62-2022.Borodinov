package structural.decorator2;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double getCost() {
        return 1.5;
    }
}
