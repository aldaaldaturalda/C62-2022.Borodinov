package homework.robot.legs;

public class ToshibaLegs implements ILeg {
    private int price;

    public ToshibaLegs(int price) {
        this.price = price;
    }

    @Override
    public void bend() {
        System.out.println("Тошиба нога может разгибаться на 80 градусов");

    }

    @Override
    public void walk() {
        System.out.println("Тошиба нога может пройтись 2000 миль без починки");

    }

    @Override
    public void extend() {
        System.out.println("Тошиба нога может полностью расширяться");

    }

    @Override
    public int getPrice() {
        return price;
    }
}
