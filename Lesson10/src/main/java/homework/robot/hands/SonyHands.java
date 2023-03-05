package homework.robot.hands;

public class SonyHands implements IHand {
    private int price;

    public SonyHands(int price) {
        this.price = price;
    }

    @Override
    public void grab() {
        System.out.println("Рука Сони захватывает объекты слишком медленно но точно");
    }

    @Override
    public void release() {
        System.out.println("Рука сони может освободиться не так быстро");
    }

    @Override
    public void upAndDown() {
        System.out.println("Рука сони быстро поднимается и опускается");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
