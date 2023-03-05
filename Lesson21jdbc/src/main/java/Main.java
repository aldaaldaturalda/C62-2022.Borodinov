import utils.CRUDUtils;

public class Main {
    public static void main(String[] args) {
        CRUDUtils.getAllStudents()
                .forEach(System.out::println);
    }
}
