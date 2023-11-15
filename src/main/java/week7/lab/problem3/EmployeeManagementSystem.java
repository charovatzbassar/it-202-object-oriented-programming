package week7.lab.problem3;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    public List<Employee> filterEmployeesBySalary(ArrayList<Employee> employees, double minSalary) {
        return employees.stream().filter(employee -> employee.salary() >= minSalary).toList();
    }

    public double calculateTotalSalary(ArrayList<Employee> employees) {
        return employees.stream().mapToDouble(Employee::salary).sum();
    }

    public void displayEmployeeDetails(ArrayList<Employee> employees) {
        employees.stream().map(employee -> {
            System.out.println(employee);
            return null;
        });
    }
}
