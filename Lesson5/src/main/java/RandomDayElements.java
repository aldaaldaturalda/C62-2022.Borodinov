import java.text.DateFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class RandomDayElements {
    public static void main(String[] args) {
        System.out.println("Enter dau number");
        Scanner scanner = new Scanner(System.in);
        int randomDayNumber = scanner.nextInt();
//        getDayWeeks2(randomDayNumber);
        getDayOfWeek(randomDayNumber);
//        switch (randomDayNumber) {
//            case 1:
//                System.out.println("Monday");
//                break;
//            case 2:
//                System.out.println("Tuesday");
//                break;
//            case 3:
//                System.out.println("Wednesday");
//                break;
//            case 4:
//                System.out.println("Thursday");
//                break;
//            case 5:
//                System.out.println("Friday");
//                break;
//            case 6:
//            case 7:
//                System.out.println("Weekends");
//                break;
//        }
    }

    public static void getDayOfWeek(int randomDay) {
        Locale localeRu = new Locale("ru", "RU");
        DateFormatSymbols dateFormatSymbols = new DateFormatSymbols(localeRu);
        String[] s = dateFormatSymbols.getWeekdays();
        randomDay = randomDay == 7 ? 1 : ++randomDay;
        System.out.println(s[randomDay]);
    }

//    public static void getDayWeeks2(Integer random) {
//        Map<Integer, String> mapDay = Map.of(1, "Понедельник", 2, "Вторник", 3, "Среда", 4,
//                "Четверг", 5, "Пятница", 6, "Суббота", 7, "Воскресенье");
//        Optional.ofNullable(random)
//                .filter(value -> value >= 1 && value <= 7)
//                .ifPresentOrElse(value -> System.out.println(mapDay.get(value)), () -> System.out.println("Передано некорректное значение"));
//    }
}
