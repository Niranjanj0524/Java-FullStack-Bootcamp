import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

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

            CallableStatement cstmt =
                    con.prepareCall(
                            "{CALL increaseSalary(?)}"
                    );

            cstmt.setDouble(1, 50000);

            cstmt.registerOutParameter(
                    1,
                    Types.DOUBLE
            );

            cstmt.execute();

            double newSalary =
                    cstmt.getDouble(1);

            System.out.println(
                    "New Salary: " + newSalary
            );

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}