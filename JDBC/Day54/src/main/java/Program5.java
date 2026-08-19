import java.sql.Connection;
import java.sql.DriverManager;

public class Program5 {

    public static Connection getConnection() {

        String url = "jdbc:mysql://localhost:3306/Day48_SQL_Practice";
        String username = "root";
        String password = "12345";

        try {

            return DriverManager.getConnection(
                    url,
                    username,
                    password
            );

        } catch (Exception e) {

            System.out.println("Database Connection Failed!");
            e.printStackTrace();

            return null;
        }
    }

    public static void main(String[] args) {

        Connection con = getConnection();

        if (con != null) {

            System.out.println(
                    "Database Connected Successfully!"
            );

            try {
                con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}