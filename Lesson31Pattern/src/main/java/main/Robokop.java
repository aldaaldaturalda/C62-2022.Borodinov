package main;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Robokop {
    private String hand;
    private String weight;
    private int timeOfWorking;
    private boolean isOn;

    public Robokop(String hand, String weight, int timeOfWorking, boolean isOn) {
        this.hand = hand;
        this.weight = weight;
        this.timeOfWorking = timeOfWorking;
        this.isOn = isOn;
    }

}


