package homework.robot.legs;

public class SamsungLegs implements ILeg {
    private int price;

    public SamsungLegs(int price) {
        this.price = price;
    }

    @Override
    public void bend() {
        System.out.println("Ноги самсунга сводятся на 90 градусов");

    }

    @Override
    public void walk() {
        System.out.println("Ноги самсунга могут прой2ти 10000 миль без фиксации");
    }

    @Override
    public void extend() {
        System.out.println("Ноги самсунга полностью расширяются");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
