package car;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Engine {
    private boolean isOn; // включен
    private int resourceOfEngine;
    private int fuelTank;// топливный бак
    private String engineType;// тип двигателя

    public Engine(boolean isOn, int resourceOfEngine, String engineType) {
        this.isOn = isOn;
        this.resourceOfEngine = resourceOfEngine;
        this.engineType = engineType;
    }

    public boolean isOn() {
        if (isOn && resourceOfEngine > 0 && fuelTank > 0) {
            System.out.println(" Car engine is turned on");
            return false;
        } else {
            System.out.println("Please turn on your car engine");
        }
        return true;
    }

    public boolean isOff() {
        if (!isOn) {
            System.out.println("Please turn off the engine");
            return false;
        }
        return true;
    }

    public int checkResourceOfEngine(int resourceOfEngine) {
        for (int i = 0; i < 1000; i++) {
            resourceOfEngine--;
        }
        return resourceOfEngine;
    }

    public boolean rideTheCar() { // eзда на машине
        if (isOff()) {
            System.out.println("Car should be turned on");// машина должна быть заведена
            return false;
        } else {
            System.out.println("Car is riding");// автомобиль едет
            return true;
        }
    }

    @Override
    public String toString() {
        return "Engine{" +
                "isOn=" + isOn +
                ", resourceOfEngine=" + resourceOfEngine +
                ", engineType='" + engineType + '\'' +
                '}';
    }
}
