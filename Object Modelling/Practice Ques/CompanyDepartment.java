import java.util.ArrayList;
import java.util.List;

// Employee class
class Employee {
    private String name;
    private String role;

    public Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    public String getDetails() {
        return name + " - " + role;
    }
}

// Department class (exists only within a company)
class Department {
    private String deptName;
    private List<Employee> employees;

    public Department(String deptName) {
        this.deptName = deptName;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        System.out.println("Employees in " + deptName + " Department:");
        for (Employee e : employees) {
            System.out.println(" - " + e.getDetails());
        }
    }
}

// Company class (composes departments)
class Company {
    private String companyName;
    private List<Department> departments;

    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompanyStructure() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showEmployees();
        }
    }

    // When Company is deleted, all departments and employees are gone
    public void closeCompany() {
        System.out.println("Closing " + companyName + "...");
        departments.clear();
    }
}

// Main class
public class CompanyDepartment {
    public static void main(String[] args) {
        // Create company
        Company company = new Company("Tech Solutions Ltd.");

        // Create departments
        Department dev = new Department("Development");
        Department hr = new Department("Human Resources");

        // Add employees
        dev.addEmployee(new Employee("Alice", "Software Engineer"));
        dev.addEmployee(new Employee("Bob", "Backend Developer"));

        hr.addEmployee(new Employee("Charlie", "HR Manager"));

        // Add departments to company
        company.addDepartment(dev);
        company.addDepartment(hr);

        // Show structure
        company.showCompanyStructure();

        // Closing company (composition effect)
        company.closeCompany();
        company.showCompanyStructure();  // Now empty
    }
}
