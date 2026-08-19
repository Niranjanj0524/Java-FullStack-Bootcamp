import java.sql.Connection;
import java.sql.DriverManager;

public class Program2 {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/Day48_SQL_Practice";
        String username = "root";
        String password = "12345";

        try{
            Connection con = DriverManager.getConnection(url, username, password);

            System.out.println("Connection Closed: " + con.isClosed());

            con.isClosed();

            con.close();
            System.out.println("Connection Closed: " + con.isClosed());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}