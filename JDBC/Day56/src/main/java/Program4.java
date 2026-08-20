import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program4 {

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

            String sql =
                    "UPDATE employees " +
                    "SET salary = ? " +
                    "WHERE id = ?";

            PreparedStatement pstmt =
                    con.prepareStatement(sql);

            pstmt.setDouble(1, 55000);
            pstmt.setInt(2, 7);
            pstmt.addBatch();

            pstmt.setDouble(1, 50000);
            pstmt.setInt(2, 8);
            pstmt.addBatch();

            pstmt.setDouble(1, 62000);
            pstmt.setInt(2, 9);
            pstmt.addBatch();

            int[] results = pstmt.executeBatch();

            System.out.println(
                    results.length +
                    " records updated using batch processing."
            );

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}