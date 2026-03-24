import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital("W Clinic", "Astana", 350);
        System.out.print("How many patients to enter? ");
        int patientnum = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= patientnum; i++) {
            System.out.print("Enter patient name: ");
            String name = scanner.nextLine();
            System.out.print("Enter age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter diagnosis: ");
            String diagnosis = scanner.nextLine();
            hospital.addPerson(new Patient(i, name, age, diagnosis));
            System.out.println();
        }

        System.out.print("How many doctors to enter? ");
        int docnum = scanner.nextInt();
        for (int i = 1; i <= docnum; i++) {
            scanner.nextLine();
            System.out.print("Enter doctor name: ");
            String doc_name = scanner.nextLine();
            System.out.print("Enter specialization: ");
            String specialization = scanner.nextLine();
            System.out.print("Enter years of experience: ");
            int expYears = scanner.nextInt();
            //scanner.nextLine();
            hospital.addPerson(new Doctor(i, doc_name, specialization, expYears));
            System.out.println();
        }

        System.out.println("All Patients:");
        hospital.showPatients();
        System.out.println();
        System.out.println();

        System.out.println("All Doctors:");
        hospital.showDoctors();
        System.out.println();

        Doctor bestDoc = null;
        Patient oldest = null;

        for (Person p : hospital.getPeople()) {
            if (p instanceof Doctor d && (bestDoc == null || d.getExpYears() > bestDoc.getExpYears()))
                bestDoc = d;

            if (p instanceof Patient pat && (oldest == null || pat.getAge() > oldest.getAge()))
                oldest = pat;
        }

        System.out.println("Most experienced doctor: " + bestDoc);
        System.out.println("Oldest patient: " + oldest);
    }
}