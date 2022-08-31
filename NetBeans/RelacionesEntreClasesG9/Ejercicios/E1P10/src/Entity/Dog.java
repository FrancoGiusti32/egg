package Entity;

public class Dog {
    private String race;
    private String name;
    private Integer age;
    private Integer sice_kg;

    public Dog(String raza, String Nombre, Integer Edad, Integer Tamaño_Kg) {
        this.race = raza;
        this.name = Nombre;
        this.age = Edad;
        this.sice_kg = Tamaño_Kg;
    }

    public String getRaza() {
        return race;
    }

    public void setRaza(String raza) {
        this.race = raza;
    }

    public String getNombre() {
        return name;
    }

    public void setNombre(String Nombre) {
        this.name = Nombre;
    }

    public Integer getEdad() {
        return age;
    }

    public void setEdad(Integer Edad) {
        this.age = Edad;
    }

    public Integer getTamaño_Kg() {
        return sice_kg;
    }

    public void setTamaño_Kg(Integer Tamaño_Kg) {
        this.sice_kg = Tamaño_Kg;
    }

    @Override
    public String toString() {
        return "Dog{"+ race + ", " + name + ", " + age + ", " + sice_kg + "kg}";
    }
    
}

