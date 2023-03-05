package homework.robot.heads;

public class ToshibaHeads implements IHead {
    private int price;

    public ToshibaHeads(int price) {
        this.price = price;
    }

    @Override
    public void turn() {
        System.out.println("Toshiba head поворачивается точно и быстро");
    }

    @Override
    public void bend() {
        System.out.println("Toshiba head наклоняется медленно и нуждается в фиксации");
    }

    @Override
    public void rotate() {
        System.out.println("Toshiba head поворачивается на 110 градусов");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
