import java.util.ArrayList;
import java.util.List;

// Patient class
class Patient {
    private String name;
    private List<Doctor> doctors;

    public Patient(String name) {
        this.name = name;
        this.doctors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Associate patient with doctor
    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    // Show doctors this patient has consulted
    public void showDoctors() {
        System.out.println(name + " has consulted with:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName());
        }
    }
}

// Doctor class
class Doctor {
    private String name;
    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getSpecialization() {   // ✅ added getter
        return specialization;
    }

    // Communication: doctor consults patient
    public void consult(Patient p) {
        System.out.println("Dr. " + name + " (" + specialization + ") is consulting " + p.getName());
        patients.add(p);
        p.addDoctor(this); // maintain two-way association
    }

    // Show patients doctor has consulted
    public void showPatients() {
        System.out.println("Dr. " + name + " has consulted with:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

// Hospital class (manages doctors and patients)
class Hospital {
    private String hospitalName;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor d) {
        doctors.add(d);
    }

    public void addPatient(Patient p) {
        patients.add(p);
    }

    // ✅ this method was missing
    public void showHospitalData() {
        System.out.println("Hospital: " + hospitalName);
        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println(" - " + d.getName() + " (" + d.getSpecialization() + ")");
        }
        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(" - " + p.getName());
        }
    }
}

// Main class
public class HospitalDoctorPatient {
    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Alice", "Cardiologist");
        Doctor d2 = new Doctor("Bob", "Neurologist");

        // Create patients
        Patient p1 = new Patient("John");
        Patient p2 = new Patient("Emma");

        // Add doctors and patients to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (communication + association)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Show doctor-patient relationships
        d1.showPatients();
        d2.showPatients();
        p1.showDoctors();
        p2.showDoctors();

        // Hospital overview
        hospital.showHospitalData();
    }
}
