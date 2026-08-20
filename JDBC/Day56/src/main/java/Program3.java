import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program3 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_day55";
        String username = "root";
        String password = "12345";

        try {

            Connection con =
                    DriverManager.getConnection(url,username,password);

            String sql =
                    "INSERT INTO employees " +
                    "(id, name, department, salary) " +
                    "VALUES (?, ?, ?, ?)";

            PreparedStatement pstmt =
                    con.prepareStatement(sql);

            pstmt.setInt(1, 7);
            pstmt.setString(2, "Kiran");
            pstmt.setString(3, "IT");
            pstmt.setDouble(4, 52000);
            pstmt.addBatch();

            pstmt.setInt(1, 8);
            pstmt.setString(2, "Pooja");
            pstmt.setString(3, "HR");
            pstmt.setDouble(4, 47000);
            pstmt.addBatch();

            pstmt.setInt(1, 9);
            pstmt.setString(2, "Rohan");
            pstmt.setString(3, "Finance");
            pstmt.setDouble(4, 58000);
            pstmt.addBatch();

            int[] results = pstmt.executeBatch();

            System.out.println(
                    results.length +
                    " records inserted using batch processing."
            );

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}