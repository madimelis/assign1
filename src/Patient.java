public class Patient {
    private int id;
    private String fullName;
    private int age;
    private String diagnosis;

    public Patient(int id, String fullName, int age, String diagnosis) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.diagnosis = diagnosis;
    }

   public void setId(int id) {
        this.id = id;
   }
   public int getId(){
        return id;
   }
    public String getFullName() {return fullName;}
    public void setFullName(String name) {this.fullName = fullName;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public String getDiagnosis() {return diagnosis;}
    public void setDiagnosis() {this.diagnosis = diagnosis;}

    @Override
    public String toString() {
        return "Patient: " +
                 "ID: " + id +
                "; Name: " + fullName +
                "; Age: " + age +
                "; Diagnosis: " + diagnosis;
    }
}