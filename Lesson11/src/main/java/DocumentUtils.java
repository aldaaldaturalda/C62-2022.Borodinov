import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DocumentUtils {
    private final static Scanner scanner = new Scanner(System.in);
    private final static String PATH = "C:\\Users\\User\\IdeaProjects\\C62-2022.Borodinov\\Lesson11\\src\\main\\java\\docNum";

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

    public static void documentsCheck() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(PATH))) {
            String name;
            while ((name = bufferedReader.readLine()) != null) {
                if (name.length() != 15) {
                    System.out.println("Документ не валиден" + " " + name);
                } else if (!name.startsWith("docNum") && !name.startsWith("contract")) {
                    System.out.println("Документ не валиден" + " " + name);
                }
            }

        } catch (IOException e) {
            System.out.println(e.getMessage() + "ошибка");
        }
    }
}

