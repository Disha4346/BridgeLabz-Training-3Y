public class PostgraduateStudent extends Student {
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void displayInfo() {
        System.out.println("Name: " + name); // accessing protected member
    }
}
