package homework.robot.heads;

public class SamsungHeads implements IHead {
    private int price;

    public SamsungHeads(int price) {
        this.price = price;
    }

    @Override
    public void turn() {
        System.out.println("Голова самсунга двигается быстро");
    }

    @Override
    public void bend() {
        System.out.println("Голова сгибается аккуратно");
    }

    @Override
    public void rotate() {
        System.out.println("Голова вращается на 180 градусов");

    }

    @Override
    public int getPrice() {
        return price;
    }
}

