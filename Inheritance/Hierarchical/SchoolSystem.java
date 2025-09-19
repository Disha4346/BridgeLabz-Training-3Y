class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name + " | Age: " + age);
    }
}

class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public void displayDetails() {
        System.out.print("Student -> ");
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayDetails() {
        System.out.print("Teacher -> ");
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayDetails() {
        System.out.print("Staff -> ");
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

public class SchoolSystem {
    public static void main(String[] args) {
        Student s1 = new Student("Aarav", 15, "10th Grade");
        Teacher t1 = new Teacher("Mr. Mehta", 40, "Mathematics");
        Staff st1 = new Staff("Ramesh", 35, "Administration");

        s1.displayDetails();
        System.out.println();
        t1.displayDetails();
        System.out.println();
        st1.displayDetails();
    }
}
