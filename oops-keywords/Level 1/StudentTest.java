public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Emma", "A");
        Student s2 = new Student(102, "Liam", "B");

        s1.displayStudentDetails();
        s2.displayStudentDetails();

        Student.displayTotalStudents();
    }
}
