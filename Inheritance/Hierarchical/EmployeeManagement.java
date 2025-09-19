abstract class Employee {
    private String name;
    private int id;
    private double salary;

    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void displayDetails();
}

class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }

    @Override
    public void displayDetails() {
        System.out.println("Manager: " + getName() + " | ID: " + getId() +
                           " | Salary: " + getSalary() +
                           " | Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        System.out.println("Developer: " + getName() + " | ID: " + getId() +
                           " | Salary: " + getSalary() +
                           " | Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String duration;

    public Intern(String name, int id, double salary, String duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("Intern: " + getName() + " | ID: " + getId() +
                           " | Stipend: " + getSalary() +
                           " | Duration: " + duration);
    }
}

public class EmployeeManagement{
    public static void main(String[] args) {
        Employee[] employees = {
            new Manager("Alice", 101, 80000, 5),
            new Developer("Bob", 102, 60000, "Java"),
            new Intern("Charlie", 103, 15000, "3 Months")
        };

        for (Employee emp : employees) {
            emp.displayDetails();
        }
    }
}
