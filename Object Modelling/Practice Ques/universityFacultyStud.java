import java.util.ArrayList;
import java.util.List;

// Faculty class (Independent, Aggregation)
class Faculty {
    private String name;
    private String subject;

    public Faculty(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getDetails() {
        return name + " teaches " + subject;
    }
}

// Department class (Composition with University)
class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}

// University class (Composes Departments, Aggregates Faculty)
class University {
    private String universityName;
    private List<Department> departments;
    private List<Faculty> faculties;  // Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void addFaculty(Faculty f) {
        faculties.add(f);
    }

    public void showStructure() {
        System.out.println("University: " + universityName);
        System.out.println("Departments:");
        for (Department d : departments) {
            System.out.println(" - " + d.getDeptName());
        }
        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            System.out.println(" - " + f.getDetails());
        }
    }

    // Closing university → destroys departments (composition)
    public void closeUniversity() {
        System.out.println("Closing University " + universityName + "...");
        departments.clear();
        faculties.clear();  // Faculties can still exist outside, but here we remove the link
    }
}

// Main class
public class universityFacultyStud {
    public static void main(String[] args) {
        // Create faculties (independent objects)
        Faculty f1 = new Faculty("Dr. Alice", "Physics");
        Faculty f2 = new Faculty("Dr. Bob", "Mathematics");

        // Create university
        University uni = new University("Oxford University");

        // Add departments (composition)
        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Biology");
        uni.addDepartment(d1);
        uni.addDepartment(d2);

        // Add faculties (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Show structure
        uni.showStructure();

        // Close university (composition effect)
        uni.closeUniversity();
        uni.showStructure();
    }
}
