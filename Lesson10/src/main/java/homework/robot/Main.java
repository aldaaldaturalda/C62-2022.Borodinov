package homework.robot;

import homework.robot.hands.SamsungHands;
import homework.robot.hands.SonyHands;
import homework.robot.hands.ToshibaHands;
import homework.robot.heads.SamsungHeads;
import homework.robot.heads.SonyHeads;
import homework.robot.heads.ToshibaHeads;
import homework.robot.legs.SamsungLegs;
import homework.robot.legs.SonyLegs;
import homework.robot.legs.ToshibaLegs;

public class Main {
    public static void main(String[] args) {
        Robot[] robot = new Robot[3];
        robot[0] = new Robot(new SamsungLegs(150), (new SonyHeads(200)), new ToshibaHands(150));
        robot[0].action();
        int x = robot[0].getPrice();
        System.out.println("Цена первого робота" + x);
        System.out.println("!!!");
        robot[1] = new Robot(new ToshibaLegs(220), (new SamsungHeads(499)), new SamsungHands(33));
        int y = robot[1].getPrice();
        System.out.println("Цена второго робота" + y);
        robot[1].action();
        System.out.println("!!!");
        robot[2] = new Robot(new SonyLegs(332), new ToshibaHeads(44), new SonyHands(111));
        int j = robot[2].getPrice();
        robot[2].action();
        System.out.println("!!!");
        int expensiveRobot = robot[2].getExpensiveRobot(robot);
        System.out.println("Самый дорогой робот робот" + expensiveRobot);
    }
}
