import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program6 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_day55";
        String username = "root";
        String password = "12345";

        Connection con = null;

        try {

            con = DriverManager.getConnection(
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

            pstmt.setInt(1, 12);
            pstmt.setString(2, "Meena");
            pstmt.setString(3, "IT");
            pstmt.setDouble(4, 50000);

            pstmt.executeUpdate();

            pstmt.setInt(1, 13);
            pstmt.setString(2, "Arjun");
            pstmt.setString(3, "Finance");
            pstmt.setDouble(4, 55000);

            pstmt.executeUpdate();

            con.rollback();

            System.out.println(
                    "Transaction rolled back."
            );

            con.close();

        } catch (Exception e) {

            try {

                if (con != null) {
                    con.rollback();
                }

                System.out.println(
                        "Error occurred. Transaction rolled back."
                );

            } catch (Exception rollbackError) {
                rollbackError.printStackTrace();
            }
        }
    }
}