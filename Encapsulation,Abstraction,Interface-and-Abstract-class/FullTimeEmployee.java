// Subclass FullTimeEmployee
public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // For full-time employees, salary is base salary + fixed allowance
        return getBaseSalary() + 5000;
    }
}
