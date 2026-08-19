import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class Program3 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/Day48_SQL_Practice";
        String username = "root";
        String password = "12345";

        try {

            Connection con = DriverManager.getConnection(
                    url,
                    username,
                    password);

            DatabaseMetaData metaData = con.getMetaData();

            System.out.println("Database Product: "
                    + metaData.getDatabaseProductName());

            System.out.println("Database Version: "
                    + metaData.getDatabaseProductVersion());

            System.out.println("Driver Name: "
                    + metaData.getDriverName());

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}