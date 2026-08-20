import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

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

            CallableStatement cstmt =
                    con.prepareCall(
                            "{CALL getEmployeeCount(?)}"
                    );

            cstmt.registerOutParameter(1,Types.INTEGER);

            cstmt.execute();

            int total = cstmt.getInt(1);

            System.out.println(
                    "Total Employees: " + total
            );

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}