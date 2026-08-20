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
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );


            String sql = "INSERT INTO employees " +
                         "(id, name, department, salary) " +
                         "VALUES(?, ?, ?, ?) ";

            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 5);
            pstmt.setString(2, "Vikas");
            pstmt.setString(3, "Marketing");
            pstmt.setDouble(4, 70000);

            int rows = pstmt.executeUpdate();
        
            System.out.println(rows + " row inserted successfully");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}