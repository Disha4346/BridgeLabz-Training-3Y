public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Alice", "Developer");
        Employee e2 = new Employee(2, "Bob", "Designer");

        e1.displayEmployeeDetails();
        e2.displayEmployeeDetails();

        Employee.displayTotalEmployees();
    }
}
