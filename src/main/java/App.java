import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
//  jdbc:postgresql://localhost:5432/
    static final String DB_URL = "jdbc:mysql://localhost:3306/mySchema";
    static final String DB_USERNAME = "root";
    static final String DB_PASSWORD = "secret";

    public static void main(String args[]) {
        App app = new App();
        app.connect();
    }

    public Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            System.out.println("Connected to the mySQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}
