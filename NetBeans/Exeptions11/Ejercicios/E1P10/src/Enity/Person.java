package Enity;


public class Person {
    public String name;
    public String sex;
    public Integer age;
    public int wheight;
    public double height;

    public Person(String name, String sex, int age, int wheight, double height) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.wheight = wheight;
        this.height = height;
    }

    public Person() {
        this.age = null;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getWheight() {
        return wheight;
    }

    public double getHeight() {
        return height;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWheight(int wheight) {
        this.wheight = wheight;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    
}
