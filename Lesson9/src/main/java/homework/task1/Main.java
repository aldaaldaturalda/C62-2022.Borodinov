package homework.task1;
//**
// *
// * Задача1: Времена года
// * 1) Создать перечисление(enum), содержащее названия времен года.
// * 2) Создать переменную содержащую ваше любимое время года и распечатать всю информацию о нем.
// * 3) Создать метод, который принимает на вход переменную созданного вами enum типа.
// *  Если значение равно Лето, выводим на консоль “Я люблю лето” и так далее. Используем оператор switch.
// * 4) Перечисление должно содержать переменную, содержащую среднюю температуру в каждом времени года.
// * 5) Добавить конструктор принимающий на вход среднюю температуру.
// * 6) Создать метод getDescription, возвращающий строку “Холодное время года”.
// *  Переопределить метод getDescription - для константы Лето метод должен возвращать “Теплое время года”.
// * 7) В цикле распечатать все времена года, среднюю температуру и описание времени года.
// *
public class Main {
    public static void main(String[] args) {
        for (Season season :Season.values()) {
            switch (season) {
                case WINTER -> System.out.println(season + season.getDescription());
                case AUTUMN -> System.out.println(season + season.getDescription());
                case SPRING -> System.out.println(season + season.getDescription());
                case SUMMER -> System.out.println(season + season.getDescription());
            }
        }
        }
    }

