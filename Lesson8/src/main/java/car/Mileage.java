package car;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Mileage {
    private int checkMileage;

    public Mileage(int checkMileage) {
        this.checkMileage = checkMileage;
    }

    public Mileage() {
    }

    public void checkMileage(int checkMileage) {

        checkMileage = 0;
        for (int i = 0; i >= checkMileage; i++) {
            checkMileage++;
        }
        System.out.println(checkMileage + " пробег  соответсвует");
    }

}
