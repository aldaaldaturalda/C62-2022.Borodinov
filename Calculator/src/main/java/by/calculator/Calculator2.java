package by.calculator;

import java.util.Scanner;

/*Калькулятор умеет выполнять операции сложения, вычитания, умножения и деления с двумя числами: a + b, a - b, a * b, a / b.
Данные передаются в одну строку (смотри пример)! Решения, в которых каждое число и арифметическая операция передаются
новой строки считаются неверными.
Калькулятор должен принимать на вход числа от 1 до 10 включительно, не более. На выходе числа не ограничиваются по величине
и могут быть любыми.
Калькулятор умеет работать только с целыми числами.
При вводе пользователем неподходящих чисел приложение выбрасывает исключение и завершает свою работу.
При вводе пользователем строки, не соответствующей одной из вышеописанных арифметических операций,
приложение выбрасывает исключение и завершает свою работу.
Результатом операции деления является целое число, остаток отбрасывается.
Результатом работы калькулятора с арабскими числами могут быть отрицательные числа и ноль.*/
public class Calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1;
        int number2;
        char operation = 0;
        int result;
        System.out.println("Введите 2 целых числа и поставьте между ними знак вычисления:");
        String userInput = scanner.nextLine();
        char[] variation = new char[10];
        for (int i = 0; i < userInput.length(); i++) {
            variation[i] = userInput.charAt(i);
            if (variation[i] == '+') {
                operation = '+';
            }
            if (variation[i] == '-') {
                operation = '-';
            }
            if (variation[i] == '*') {
                operation = '*';
            }
            if (variation[i] == '/') {
                operation = '/';
            }
        }
        try {
            String variationString = String.valueOf(variation);
            String[] splitOption = variationString.split("[+-/*]");
            String var0 = splitOption[0];
            String var1 = splitOption[1];
            String var3 = var1.trim();
            number1 = Integer.parseInt(var0);
            number2 = Integer.parseInt(var3);
            result = calulated(number1, number2, operation);
            System.out.println("Результат:" + number1 + " " + operation + " " + number2 + " = " + result);
        } catch (Exception e) {
            System.out.println(e.getMessage() + "Ошибка,попробуйте еще раз");
        }
    }

    public static int calulated(int number1, int number2, char operation) {
        int result;
        switch (operation) {
            case '+' -> result = number1 + number2;
            case '-' -> result = number1 - number2;
            case '*' -> result = number1 * number2;
            case '/' -> result = number1 / number2;
            default -> throw new IllegalArgumentException("Неверный знак для операции");
        }
        return result;
    }
}
