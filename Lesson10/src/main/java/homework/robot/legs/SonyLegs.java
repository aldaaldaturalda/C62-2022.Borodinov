package homework.robot.legs;

public class SonyLegs implements ILeg {
    private int price;

    public SonyLegs(int price) {
        this.price = price;
    }

    @Override
    public void bend() {
        System.out.println("Нога Сони может разгибаться на 110 градусов");

    }

    @Override
    public void walk() {
        System.out.println("Нога СОни может пройти 18888 миль без фиксации");

    }

    @Override
    public void extend() {
        System.out.println("Нога СОни может расширяться на 170 градусов");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
