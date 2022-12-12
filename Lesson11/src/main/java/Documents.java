import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
public class Documents {
    public static void readFile() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String choice;
        choice = scanner.next();
        Reader reader = new FileReader(choice);
        BufferedReader bufferedReader = new BufferedReader(reader);
        String name;
        while ((name = bufferedReader.readLine()) != null) {
            System.out.println(name);
        }
    }

    public static void documetsCheck() throws IOException {
        Reader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\C62-2022.Borodinov\\Lesson11\\src\\main\\java\\docNum");
        BufferedReader bufferedReader = new BufferedReader(reader);
        String name;
        while ((name = bufferedReader.readLine()) != null) {
            if(name.length() != 15){
                System.out.println("Документ не валиден"+ " " + name);
            }
            else if (!name.startsWith("docNum") && !name.startsWith("contract")){
                System.out.println("Документ не валиден" + " " + name);
            }
        }
    }
}
