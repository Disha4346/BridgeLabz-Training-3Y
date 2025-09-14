import java.util.ArrayList;

// Main class to demonstrate polymorphism
public class EmployeeManagement {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee ftEmployee = new FullTimeEmployee(1, "Alice", 50000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee(2, "Bob", 20000, 80, 150);

        employees.add(ftEmployee);
        employees.add(ptEmployee);

        // Display details using polymorphism
        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
