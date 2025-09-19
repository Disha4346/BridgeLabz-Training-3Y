class Course {
    private String courseName;
    private int duration; // in weeks

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getDuration() {
        return duration;
    }

    public void displayDetails() {
        System.out.println("Course: " + courseName + " | Duration: " + duration + " weeks");
    }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayDetails() {
        System.out.println("Course: " + getCourseName() + " | Duration: " + getDuration() +
                           " weeks | Platform: " + platform + " | Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // in percentage

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,
                            double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Course: " + getCourseName() + " | Duration: " + getDuration() +
                           " weeks | Fee: $" + fee + " | Discount: " + discount + "%" +
                           " | Final Price: $" + (fee - (fee * discount / 100)));
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        Course basic = new Course("Introduction to AI", 6);
        OnlineCourse freeCourse = new OnlineCourse("Web Development", 8, "Udemy", true);
        PaidOnlineCourse paid = new PaidOnlineCourse("Data Science Bootcamp", 12, "Coursera", true, 500, 20);

        basic.displayDetails();
        freeCourse.displayDetails();
        paid.displayDetails();
    }
}
