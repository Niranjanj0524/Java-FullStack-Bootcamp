import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class Program5 {

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
                            "{CALL getEmployeesByDepartment(?)}"
                    );

            cstmt.setString(1, "IT");

            ResultSet rs =
                    cstmt.executeQuery();

            while (rs.next()) {

                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getString("department") + " | " +
                        rs.getDouble("salary")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}