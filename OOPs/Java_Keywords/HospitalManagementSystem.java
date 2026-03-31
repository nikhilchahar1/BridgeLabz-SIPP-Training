class Patient {
    static String hospitalName = "City Care Hospital";
    static int totalPatients = 0;

    final int patientID;
    String name;
    int age;
    String ailment;

    // Constructor using 'this'
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++;
    }

    // Static method to get total patients
    static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }

    // Method to display patient details after instanceof check
    void displayDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Patient ID: " + p.patientID);
            System.out.println("Name: " + p.name);
            System.out.println("Age: " + p.age);
            System.out.println("Ailment: " + p.ailment);
            System.out.println("Hospital: " + hospitalName);
        } else {
            System.out.println("Invalid patient object.");
        }
    }
}

public class HospitalManagementSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(1001, "Anil Verma", 45, "Diabetes");
        Patient p2 = new Patient(1002, "Sita Devi", 60, "Hypertension");

        p1.displayDetails(p1);
        p2.displayDetails(p2);

        Patient.getTotalPatients();
    }
}
