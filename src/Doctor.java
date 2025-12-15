public class Doctor {
    private int id;
    private String fullName;
    private String specialization;
    private int expYears;

    public Doctor(int id, String fullName, String specialization, int expYears) {
        this.id = id;
        this.fullName = fullName;
        this.specialization = specialization;
        this.expYears = expYears;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}
    public String getFullName() {return fullName;}
    public void setFullName(String fullName) {this.fullName = fullName;}
    public String getSpecialization() {return specialization;}
    public void setSpecialization(String specialization) {this.specialization = specialization;}
    public int getExpYears() {return expYears;}
    public void setExpYears(int expYears) {this.expYears = expYears;}

    @Override
    public String toString() {
        return "Doctor: " +
                " ID: " + id +
                ", Name: " + fullName +
                ", Specialization: " + specialization +
                ", Experience: " + expYears;
    }
}
