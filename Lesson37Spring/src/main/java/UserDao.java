import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@AllArgsConstructor
@Getter
@Setter
public class UserDao {
    private String login;
    private String pass;
    private String description;
    private int id;

    public UserDao findById(Integer id) {
        try (Connection connection = Application.INSTANCE.dataSource().getConnection()) {
//            Statement statement = connection.createStatement("select * from users where id =  ?");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users order by id");
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public UserDao findByName(String name) {
        try (Connection connection = Application.INSTANCE.dataSource().getConnection()) {
//            Statement statement = connection.createStatement("select * from users where id =  ?");
            PreparedStatement preparedStatement = connection.prepareStatement("select * from users order by name");
            return users;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

//    public DataSource newDataSource() {
//        MysqlDataSource dataSource = new MysqlDataSource();
//        dataSource.setUser("root");
//        dataSource.setPassword("s3cr3t");
//        dataSource.setURL("jdbc:mysql://localhost:3306/myDatabase");
//        return dataSource;
//    }
}
