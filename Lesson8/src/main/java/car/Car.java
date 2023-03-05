package car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Car {
    private FuelTank fuelTank;// топливный бак
    private Engine engine;// двигатель
    private Mileage mileage;// пробег
    private String carBand; // марка автомобиля
    private int carYear; // год выпуска
    private int checkMileage; // проверка пробега

    public Car(Engine engine, FuelTank fuelTank, String carBand, int carYear) {
        this.engine = engine;
        this.carBand = carBand;
        this.carYear = carYear;
    }

    public Car(FuelTank fuelTank, Engine engine, Mileage mileage, String carBand, int carYear, int checkMileage) {
        this.fuelTank = fuelTank;
        this.engine = engine;
        this.mileage = mileage;
        this.carBand = carBand;
        this.carYear = carYear;
        this.checkMileage = checkMileage;
    }

    public Car() {

    }

    public int checkDistance(int checkMileage) { // вспомнить как правильно вызывать метод!(--)
        if (checkMileage > 0 && engine.isOn() && !engine.isOff()) {
            for (int i = 0; i < checkMileage; i++) {
                checkMileage--;
            }
        }
        return checkMileage;
    }
}
