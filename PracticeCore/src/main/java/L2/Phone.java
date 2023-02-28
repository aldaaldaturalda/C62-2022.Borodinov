package L2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Arrays;

/*
Создайте класс Phone, который содержит переменные number, model и weight.
Создайте три экземпляра этого класса.
Выведите на консоль значения их переменных.
Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение
“Звонит {name}”. Метод getNumber – возвращает номер телефона.// уже под капотом!!!
 Вызвать эти методы для каждого из объектов.
Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации переменных класса - number, model и weight.
Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
//Добавить конструктор без параметров.
Вызвать из конструктора с тремя параметрами конструктор с двумя.// Это все @ALlArgsConstructor
Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего. Вызвать этот метод.
Создать метод sendMessage с аргументами переменной длины. Данный метод принимает на вход номера телефонов,
которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
 */
@Setter
@Getter
@ToString
@AllArgsConstructor
public class Phone {
    private long number;
    private String model;
    private int weight;

    public static void main(String[] args) {
        Phone phone = new Phone(80447345542l, "Iphone", 300);
        Phone phone1 = new Phone(804445454444l, "Samsung", 333);
        Phone phone2 = new Phone(80331111111l, "Nokia", 500);
        receiveCall("Коля ", phone.number);
//        receiveCall("Петя", phone1.number);
//        receiveCall("Алекс", phone2.number);
//        phone.sendMessage("Привет как дела?", "80447345542");
        phone.sendMessage("У кабана? ", "80447345542", "804445454444", "80331111111");
    }

    public static void receiveCall(String name, long number) {
        System.out.println("“Звонит ”" + name + number);

    }

    public long getNumber() {
        return number;
    }

    void sendMessage(String message, String... numbers) {
        System.out.println("Message: " + message + "Отправлено для:");
        System.out.println(Arrays.toString(numbers));
    }
}

