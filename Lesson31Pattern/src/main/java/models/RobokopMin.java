package models;

public class RobokopMin implements CreateRobokopFactoryImpl {
    @Override
    public Head createHead() {
        return new Head();
    }

    @Override
    public Leg createLeg() {
        return new Leg();
    }

    @Override
    public Battery createBattery() {
        return new Battery();
    }

    @Override
    public LifeCount createlifeCount() {
        return new LifeCount();
    }
}
