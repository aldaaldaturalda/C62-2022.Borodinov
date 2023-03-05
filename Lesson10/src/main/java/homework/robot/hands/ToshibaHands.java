package homework.robot.hands;

public class ToshibaHands implements IHand {
    private int price;

    public ToshibaHands(int price) {
        this.price = price;
    }

    @Override
    public void grab() {
        System.out.println("Рука Тошиба очень мощная");
    }

    @Override
    public void release() {
        System.out.println("Рука Тошиба очень тяжелая чтобы поднимать быстро");

    }

    @Override
    public void upAndDown() {
        System.out.println("Рука Тошиба делает точные движения");

    }

    @Override
    public int getPrice() {
        return price;
    }

}
