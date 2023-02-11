import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentUtils {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String PATH = "Lesson11/src/main/java/docNum";

    public DocumentUtils() {
    }

    public static void readFile() {
        String choice = scanner.next();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(choice))) {
            String name;
            while ((name = bufferedReader.readLine()) != null) {
                System.out.println(name);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage() + " error");
        }
    }

    public static boolean documentsCheck() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            String name;
            while ((name = bufferedReader.readLine()) != null) {
                if (name.length() != 15 && !name.startsWith("docNum") && !name.startsWith("contract")) {
                    System.out.println("Документ не валиден" + " " + name);
                    return false;
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage() + "ошибка");
        }
        return true;
    }
}

