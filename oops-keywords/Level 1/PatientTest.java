public class PatientTest {
    public static void main(String[] args) {
        Patient p1 = new Patient(1001, "Anil", 45, "Flu");
        Patient p2 = new Patient(1002, "Sita", 30, "Allergy");

        p1.displayPatientDetails();
        p2.displayPatientDetails();

        Patient.getTotalPatients();
    }
}
