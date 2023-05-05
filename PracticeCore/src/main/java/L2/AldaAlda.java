package L2;

import java.util.Scanner;

public class AldaAlda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        String age = scanner.nextLine();
        switch (age) {
            case "null":
                System.out.println("ты родился");
                break;
            case "eleven":
                System.out.println("ты пошел в школу");
                break;
            case "seventeen":
                System.out.println("ты закончил школу");
                break;
            default:
                System.out.println("Ни одно из предыдущих условий не подошло");
        }
    }
}
