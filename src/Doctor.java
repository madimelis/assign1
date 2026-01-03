public class Doctor extends Person{
    private String specialization;
    private int expYears;

    public Doctor(int id, String fullName, String speciality, int expYears) {
        super(id, fullName);
        this.specialization = speciality;
        this.expYears = expYears;
    }

    public String getSpecialization() {return specialization;}
    public void setSpecialization(String specialization) {this.specialization = specialization;}
    public int getExpYears() {return expYears;}
    public void setExpYears(int expYears) {this.expYears = expYears;}

    @Override
    public String getRole() {
        return "Doctor";
    }
    @Override
    public String toString() {
        return "Doctor: " +
                "ID: " + id +
                "; Name: " + fullName +
                "; Specialization: " + specialization +
                "; Experience: " + expYears;
    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor doctor = (Doctor) o;
        return getId() == doctor.getId();
    }
    @Override
    public int hashCode() {
        return Integer.hashCode(getId());
    }
}
