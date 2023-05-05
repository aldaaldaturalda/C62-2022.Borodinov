package L2;

import java.util.Scanner;

public class SwitchSw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("I am start live");
                break;
            case 7:
                System.out.println("I am go to school");
                break;
            case 18:
                System.out.println("I am end the school");
                break;
            default:
                System.out.println("not corrected age you turn");
        }
    }
}
