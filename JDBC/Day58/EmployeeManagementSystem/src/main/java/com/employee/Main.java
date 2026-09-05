package com.employee;

import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDAO dao = new EmployeeDAO();

        while (true) {
            System.out.println("\n=================================");
            System.out.println("     EMPLOYEE MANAGEMENT SYSTEM");
            System.out.println("=================================");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. View Employee By ID");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.println("=================================");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter employee name: ");
                    String name = sc.nextLine();

                    System.out.println("Enter employee email: ");
                    String email = sc.nextLine();

                    System.out.println("Enter department: ");
                    String department = sc.nextLine();

                    System.out.println("Enter salary: ");
                    double salary = sc.nextDouble();

                    Employee employee = new Employee(
                            name,
                            email,
                            department,
                            salary);

                    dao.addEmployee(employee);

                    break;

                case 2:
                    List<Employee> employees = dao.getAllEmployees();

                    if (employees.isEmpty()) {
                        System.out.println("Employee not found");
                    } else {
                        System.out.println("\n----- Employee List -----");

                        for (Employee emp : employees) {
                            System.out.println(emp);
                        }
                    }

                    break;

                case 3:
                    System.out.println("Enter employee ID: ");

                    int id = sc.nextInt();
                    Employee foundEmployee = dao.getEmployeeById(id);

                    if (foundEmployee != null) {
                        System.out.println("\nEmployee Found:");

                        System.out.println(foundEmployee);
                    } else {
                        System.out.println("Employee not found.");
                    }

                    break;

                case 4:
                    System.out.print("Enter employee ID: ");

                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");

                    String updateName = sc.nextLine();

                    System.out.print("Enter new email: ");

                    String updateEmail = sc.nextLine();

                    System.out.print("Enter new department: ");

                    String updateDepartment = sc.nextLine();

                    System.out.print("Enter new salary: ");

                    double updateSalary = sc.nextDouble();

                    Employee updatedEmployee = new Employee(
                            updateId,
                            updateName,
                            updateEmail,
                            updateDepartment,
                            updateSalary);

                    dao.updateEmployee(updatedEmployee);

                    break;

                case 5:
                    System.out.print("Enter employee ID: ");

                    int deleteId = sc.nextInt();

                    dao.deleteEmployee(deleteId);

                    break;

                case 6:
                    System.out.println("\nThank you for using " + "Employee Management System!");

                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice! " + "Please try again.");
            }
        }

    }
}