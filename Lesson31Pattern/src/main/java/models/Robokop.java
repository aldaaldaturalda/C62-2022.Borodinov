package models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Robokop implements CreateRobokopPartsImpl {


    @Override
    public Head getHead() {
        return new Head();
    }

    @Override
    public Leg getLeg() {
        return new Leg();
    }

    @Override
    public Battery getBattery() {
        return new Battery();
    }

    @Override
    public LifeCount getLifeCount() {
        return new LifeCount();
    }
}


