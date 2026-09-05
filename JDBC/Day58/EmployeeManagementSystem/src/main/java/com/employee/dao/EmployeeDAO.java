package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.employee.model.Employee;
import com.employee.util.DBConnection;

public class EmployeeDAO {

    // ADD EMPLOYEE
    public void addEmployee(Employee employee) {

        String sql = "INSERT INTO employees " +
                "(name, email, department, salary) " +
                "VALUES (?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setDouble(4, employee.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully");
            }

        } catch (SQLException e) {
            System.out.println("Error adding employee: "
                    + e.getMessage());
        }
    }

    // GET ALL EMPLOYEES
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        String sql = "SELECT * FROM employees";

        try (Connection con = DBConnection.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Employee employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("department"),
                        rs.getDouble("salary"));

                employees.add(employee);
            }

        } catch (SQLException e) {
            System.out.println("Error fetching employees: "
                    + e.getMessage());
        }

        return employees;
    }

    // GET EMPLOYEE BY ID
    public Employee getEmployeeById(int id) {

        String sql = "SELECT * FROM employees WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                return new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("department"),
                        rs.getDouble("salary"));
            }

        } catch (SQLException e) {
            System.out.println("Error finding employee: "
                    + e.getMessage());
        }

        return null;
    }

    // UPDATE EMPLOYEE
    public void updateEmployee(Employee employee) {

        String sql = "UPDATE employees SET " +
                "name = ?, email = ?, department = ?, salary = ? " +
                "WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setDouble(4, employee.getSalary());
            ps.setInt(5, employee.getId());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Updated Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

        } catch (SQLException e) {
            System.out.println("Error updating employee: "
                    + e.getMessage());
        }
    }

    // DELETE EMPLOYEE
    public void deleteEmployee(int id) {

        String sql = "DELETE FROM employees WHERE id = ?";

        try (Connection con = DBConnection.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Deleted Successfully");
            } else {
                System.out.println("Employee Not Found");
            }

        } catch (SQLException e) {
            System.out.println("Error deleting employee: "
                    + e.getMessage());
        }
    }
}