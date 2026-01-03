public class Patient extends Person{
    private int age;
    private String diagnosis;

    public Patient(int id, String fullName, int age, String diagnosis) {
        super(id, fullName);
        this.age = age;
        this.diagnosis = diagnosis;
    }

    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getDiagnosis() {return diagnosis;}
    public void setDiagnosis() {this.diagnosis = diagnosis;}

    @Override
    public String getRole(){
        return "Patient";
    }
    @Override
    public String toString() {
        return "Patient: " +
                 "ID: " + getId() +
                "; Name: " + getFullName() +
                "; Age: " + age +
                "; Diagnosis: " + diagnosis;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if(!(o instanceof Patient)) return false;
        Patient patient = (Patient) o;
        return getId() == patient.getId();
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }
}