import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Program1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_day55";
        String username = "root";
        String password = "12345";

        try{
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM employees";

            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();

            System.out.println("Employee Details: ");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("department") + " | " +
                    rs.getDouble("salary") 
                );
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
