class Hospital {
    String hospitalName = "srikakulam Govt Hospital";
    void displayHospital() {
        System.out.println("Welcome to " + hospitalName);
    }
}

class Doctor extends Hospital {
    String doctorName;
    String specialization;

    Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Doctor: " + doctorName + ", Specialization: " + specialization);
    }
}

class Patient extends Hospital {
    String patientName;
    int age;

    Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient: " + patientName + ", Age: " + age);
    }
}

class Staff extends Hospital {
    String staffName;
    String role;

    Staff(String staffName, String role) {
        this.staffName = staffName;
        this.role = role;
    }

    void displayStaff() {
        System.out.println("Staff: " + staffName + ", Role: " + role);
    }
}

public class Hospital_mgmt {
    public static void main(String[] args) {
        Doctor d = new Doctor("Dr. Ravi", "Neurologist");
        Patient p = new Patient("phani", 45);
        Staff s = new Staff("karthik", "Nurse");

        d.displayHospital();
        d.displayDoctor();
        p.displayHospital();
        p.displayPatient();
        s.displayHospital();
        s.displayStaff();
    }
}