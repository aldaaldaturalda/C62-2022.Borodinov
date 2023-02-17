package car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FuelTank {
    private int tankVolume;// объем бака

    public FuelTank(int tankVolume) {
        this.tankVolume = tankVolume;
    }

    public int checkFuel(int tankVolume) {// проверка топлива
        for (int i = 0; i < tankVolume; i++) {
            tankVolume--;
        }
        if (tankVolume <= 0) {
            System.out.println("Автомобиль должен быть заправлен");
            return 0;
        } else {
            System.out.println("Вы можете ехать на машине");
        }
        return tankVolume;
    }
}
