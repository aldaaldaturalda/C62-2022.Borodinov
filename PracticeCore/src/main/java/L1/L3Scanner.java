package L1;

import java.util.Scanner;

public class L3Scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку потом число");//для показа работы программы и понимания, что вводить
        String s = scanner.nextLine();
        System.out.println("Вы ввели строку " + s);
        int x = scanner.nextInt();
        System.out.println(s + x);
    }
}
