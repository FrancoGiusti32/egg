package Entity;

import java.util.Date;

public class User {

    public String name;
    public String lastname;
    public String country;
    public int dni;
    public Date birth;

    public User() {
    }

    public User(String name, String lastname, String country, int dni, Date birth) {
        this.name = name;
        this.lastname = lastname;
        this.country = country;
        this.dni = dni;
        this.birth = birth;
    }
    
    
}
