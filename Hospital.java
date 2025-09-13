package inheritance;

//Base Class
class Person {
 String name;
 int age;

 Person() {
     System.out.println("Default Person Constructor");
 }

 Person(String name, int age) {
     this.name = name;
     this.age = age;
     System.out.println("Person: " + name + ", Age: " + age);
 }
}

class Doctor extends Person {
    String specialization;

    Doctor() {
        super("Default Doctor", 40);
    }

    Doctor(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
        System.out.println("Doctor Specialization: " + specialization);
    }
}
//--- Hierarchical Inheritance ---
class Patient extends Person {
 int patientId;

 Patient(String name, int age, int patientId) {
     super(name, age);
     this.patientId = patientId;
     System.out.println("Patient ID: " + patientId);
 }
}

class Nurse extends Person {
 String shift;

 Nurse(String name, int age, String shift) {
     super(name, age);
     this.shift = shift;
     System.out.println("Nurse Shift: " + shift);
 }
}
//--- Multiple Inheritance (using interfaces) ---
interface Insurance {
 String insuranceType = "Health Insurance";
}

interface MedicalHistory {
 String history = "Diabetes";
}

class EmergencyPatient extends Patient implements Insurance, MedicalHistory {
 EmergencyPatient(String name, int age, int patientId) {
     super(name, age, patientId);
     System.out.println("Has " + insuranceType + " | History: " + history);
 }
}


public class Hospital {
	 public static void main(String[] args) {
	        System.out.println("\n--- Single Inheritance Example ---");
	        Doctor d1 = new Doctor("Sharma", 50, "Cardiologist");

	        System.out.println("\n--- Hierarchical Inheritance Example ---");
	        Patient p1 = new Patient("Ravi", 30, 101);
	        Nurse n1 = new Nurse("Anita", 28, "Night");

	        System.out.println("\n--- Multiple Inheritance Example ---");
	        EmergencyPatient ep1 = new EmergencyPatient("Meena", 45, 202);
	    }

}
