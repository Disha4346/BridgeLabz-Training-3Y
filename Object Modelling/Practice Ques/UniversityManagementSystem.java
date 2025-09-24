import java.util.ArrayList;
import java.util.List;

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

    // Student enrolls in a course
    public void enrollCourse(Course c) {
        courses.add(c);
        c.addStudent(this); // Association: add student to course
        System.out.println(name + " enrolled in " + c.getCourseName());
    }

    // Show courses student has enrolled in
    public void showCourses() {
        System.out.println(name + " is enrolled in:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}

// Professor class
class Professor {
    private String name;
    private List<Course> courses;

    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Assign professor to a course
    public void assignCourse(Course c) {
        courses.add(c);
        c.setProfessor(this); // Aggregation: course has a professor
        System.out.println("Professor " + name + " is assigned to teach " + c.getCourseName());
    }

    // Show courses professor teaches
    public void showCourses() {
        System.out.println("Professor " + name + " teaches:");
        for (Course c : courses) {
            System.out.println(" - " + c.getCourseName());
        }
    }
}

// Course class
class Course {
    private String courseName;
    private Professor professor;  // Aggregation: professor assigned
    private List<Student> students; // Association: multiple students

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        }
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println(" - " + s.getName());
        }
    }
}

// Main class
public class UniversityManagementSystem {
    public static void main(String[] args) {
        // Create students
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        // Create professors
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. Johnson");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Physics");

        // Assign professors to courses
        p1.assignCourse(c1);
        p2.assignCourse(c2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Show relationships
        s1.showCourses();
        s2.showCourses();

        p1.showCourses();
        p2.showCourses();

        c1.showCourseDetails();
        c2.showCourseDetails();
    }
}
