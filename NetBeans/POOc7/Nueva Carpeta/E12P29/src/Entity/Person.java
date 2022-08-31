package Entity;

import java.util.Date;

public class Person {

    public String name;
    public Date birthDay;

    public Person() {
    }

    public Person(String name, Date birthDay) {
        this.name = name;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

}
