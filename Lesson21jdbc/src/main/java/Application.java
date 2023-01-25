import model.Student;
import utils.CRUDUtils;
import utils.DbUtils;

public class Application {
    public static void main(String[] args){
        CRUDUtils.getAllStudents()
                .forEach(System.out::println);
    }
}
