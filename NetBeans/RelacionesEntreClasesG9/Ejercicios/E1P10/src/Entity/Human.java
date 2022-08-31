package Entity;

public class Human {
    private String name;
    private String lastName;
    private Integer age;
    private Integer DNI;
    private Dog pet;

    public Human(String name, String lastName, Integer age, Integer DNI, Dog pet) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.DNI = DNI;
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Human{" + name + " " + lastName + " " + age + "\n DNI=" + DNI + "\n pet=" + pet + '}';
    }
    
}
