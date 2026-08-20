import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Program2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_day55";
        String username = "root";
        String password = "12345";

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            Statement stmt = con.createStatement();

            String sql = "SELECT * FROM employees";

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}