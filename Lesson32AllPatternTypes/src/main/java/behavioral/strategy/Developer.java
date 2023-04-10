package behavioral.strategy;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Developer {
    private Activity activity;

    public void executeActivity() {
        activity.justDoIt();
    }
}
