import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/Day48_SQL_Practice";
        String username = "root";
        String password = "12345";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected Successfully!");
            con.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
