package homework.robot.hands;

public class SamsungHands implements IHand {
    private int price;

    public SamsungHands(int price) {
        this.price = price;
    }

    @Override
    public void grab() {
        System.out.println("Рука самсунга может захватить широкие предметы");
    }

    @Override
    public void release() {
        System.out.println("Рука самсунга может освободить предмет быстрее чем кто-либо");
    }

    @Override
    public void upAndDown() {
        System.out.println("Рука самсунга может медленно поднимать и опускать руку");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
