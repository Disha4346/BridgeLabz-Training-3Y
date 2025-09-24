import java.util.ArrayList;
import java.util.List;

// Course class
class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void showStudents() {
        System.out.println("Students enrolled in " + courseName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

// Student class
class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course c) {
        courses.add(c);
        c.enrollStudent(this); // two-way association
    }

    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}

// School class (Aggregation with students)
class School {
    private String schoolName;
    private List<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Students in " + schoolName + ":");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

// Main class
public class SchoolCourseStudent {
    public static void main(String[] args) {
        // Create school
        School school = new School("Green Valley High");

        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Add students to school (Aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Create courses
        Course math = new Course("Mathematics");
        Course science = new Course("Science");

        // Enroll students in courses (Association)
        s1.enrollInCourse(math);
        s1.enrollInCourse(science);
        s2.enrollInCourse(math);

        // Show data
        school.showStudents();
        s1.showCourses();
        s2.showCourses();

        math.showStudents();
        science.showStudents();
    }
}
