import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Program2 {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc_day55";
        String username = "root";
        String password = "12345";

        try {

            Connection con =
                    DriverManager.getConnection(url,username,password);

            String sql = "SELECT * FROM employees";

            PreparedStatement pstmt =
                    con.prepareStatement(
                            sql,
                            ResultSet.TYPE_SCROLL_INSENSITIVE,
                            ResultSet.CONCUR_READ_ONLY
                    );

            ResultSet rs = pstmt.executeQuery();

            if (rs.first()) {

                System.out.println("First Employee:");

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name")
                );
            }

            if (rs.last()) {

                System.out.println("\nLast Employee:");

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name")
                );
            }

            if (rs.previous()) {

                System.out.println("\nPrevious Employee:");

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name")
                );
            }
            

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}