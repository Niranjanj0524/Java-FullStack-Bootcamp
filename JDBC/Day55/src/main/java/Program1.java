import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Program1 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc_day55";
        String username = "root";
        String password = "12345";

        try{
            Connection con = DriverManager.getConnection(url, username, password);

            Statement stmt = con.createStatement();

            String sql = "INSERT INTO employees " +
                         "(id, name, department, salary) " +
                         "VALUES (4, 'Sneha', 'IT', 60000) ";

            int rows = stmt.executeUpdate(sql);
            System.out.println(rows + " rows inserted successfully");

            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }    
}