package repository;

import lombok.AllArgsConstructor;
import lombok.Getter;
import models.City;
import models.Students;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Getter
@AllArgsConstructor
public class StudentDatabase implements StudentRepositoryAware {
    private final Connection connection;
    private final String PATH = "select students_db.students.id, name, surname, age, course, city_id from students_db.students";
    private final String JOIN_PATH = "SELECT * from students_db.students left join students_db.city c on c.id_for_city = students.city_id";
    private static final String INSERT_NEW_STUDENT = "INSERT INTO students_db.students(id, name, surname, age, course, city_id) VALUES(?, ?, ?, ?, ?, ?);";
    private static final String DELETE_STUDENT_QUERY = "DELETE FROM students_db.students WHERE id = ?";

    @Override
    public List<Students> searchStudents() {
        List<Students> students = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(JOIN_PATH);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String surname = resultSet.getString("surname");
                int age = resultSet.getInt("age");
                int course = resultSet.getInt("course");
                int idForCity = resultSet.getInt("id_for_city");
                String cityName = resultSet.getString("city");
                Students student = new Students(id, name, surname, age, course, new City(idForCity, cityName));
                students.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return students;
    }

    public List<Students> insertNewStudents(Students students) {
        List<Students> newStudents;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_STUDENT);
            preparedStatement.setString(1, students.getCity().getCityName());
            preparedStatement.setInt(2, students.getId());
            preparedStatement.setString(3, students.getName());
            preparedStatement.setString(4, students.getSurname());
            preparedStatement.setInt(5, students.getAge());
            preparedStatement.setInt(6, students.getCourse());
            preparedStatement.executeUpdate();
            newStudents = new ArrayList<>();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return newStudents;
    }

    public List<Students> deleteStudents(int id) {
        List<Students> studentsList;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_STUDENT_QUERY);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            studentsList = searchStudents();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage() + " Exception");
        }
        return studentsList;
    }
}
