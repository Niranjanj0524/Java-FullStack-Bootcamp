import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program5 {

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

            con.setAutoCommit(false);

            String sql =
                    "INSERT INTO employees " +
                    "(id, name, department, salary) " +
                    "VALUES (?, ?, ?, ?)";

            PreparedStatement pstmt =
                    con.prepareStatement(sql);

            pstmt.setInt(1, 10);
            pstmt.setString(2, "Anjali");
            pstmt.setString(3, "IT");
            pstmt.setDouble(4, 60000);

            pstmt.executeUpdate();

            pstmt.setInt(1, 11);
            pstmt.setString(2, "Vijay");
            pstmt.setString(3, "HR");
            pstmt.setDouble(4, 48000);

            pstmt.executeUpdate();

            con.commit();

            System.out.println(
                    "Transaction committed successfully."
            );

            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}