import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String location;
    private int capacity;

    private List<Person> people = new ArrayList<>();

    public Hospital(String name, String location, int capacity) {
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}
    public int getCapacity() {return capacity;}
    public void setCapacity(int capacity) {this.capacity = capacity;}

    public void addPerson(Person person) {
        people.add(person);
    }

    public Person findById(int id) {
        for (Person p : people) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    public void showDoctors() {
        for (Person p : people) {
            if (p instanceof Doctor) {
                System.out.println(p);
            }
        }
    }
    public void showPatients() {
        for (Person p : people) {
            if (p instanceof Patient) {
                System.out.println(p);
            }
        }
    }
    public List<Person> getPeople() { return people; }

    public void sortByName() {
        people.sort((a, b) -> a.getFullName().compareTo(b.getFullName()));
    }
    @Override
    public String toString() {
        return "Hospital: " +
                "Name: " + name +
                "; Location: " + location +
                "; Capacity: " + capacity;
    }
}