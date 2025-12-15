public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1, "Alam Arman", 20, "Food poisoning");
        Patient patient2 = new Patient(2, "John Pork", 35, "Flu");
        Doctor doctor1 = new Doctor(1, "John Watson", "Therapist", 7);
        Doctor doctor2 = new Doctor(2, "Charles Pepper", "Surgeon", 20);
        Hospital hospital = new Hospital("W Clinic", "Astana", 350);

        System.out.println(patient1);
        System.out.println(patient2);
        System.out.println(doctor1);
        System.out.println(doctor2);
        System.out.println(hospital);
    }
}