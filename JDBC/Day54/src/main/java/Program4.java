import java.sql.Connection;
import java.sql.DriverManager;

public class Program4 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Day48_SQL_Practice";
        String username = "root";

        // Intentionally wrong password
        String password = "1234";

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            System.out.println("Database Connected!");

            con.close();

        } catch (Exception e) {

            System.out.println("Database Connection Failed!");
            System.out.println("Error: " + e.getMessage());

        }
    }
}