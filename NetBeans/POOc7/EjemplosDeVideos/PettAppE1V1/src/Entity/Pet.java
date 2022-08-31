package Entity;

public class Pet {

    private String name;
    private String nickname;
    private String race;
    private String color;
    private String type;
    private int age;
    private boolean tail;
    private int energi;

    public Pet() {
        energi=1000;
    }

    public Pet(String name, String nickname, String type) {
        this.name = name;
        this.nickname = nickname;
        this.type = type;
        energi=1000;
    }

    public Pet(String name, String nickname, String race, String color, String type, int age, boolean tail) {
        this.name = name;
        this.nickname = nickname;
        this.race = race;
        this.color = color;
        this.type = type;
        this.age = age;
        this.tail = tail;
        energi=1000;
    }

    public void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    public String getName() {
        return name;
    }

    public int pasear(int energiaRest) {
        this.energi -= energiaRest;
        return energi;
    }
    public int pasear(int energiaRest, int times) {
        for (int i = 0; i < times; i++) {
        this.energi -= energiaRest;
        }
        return energi;
    }

    @Override
    public String toString() {
        return "Pet{" + "name=" + name + ", nickname=" + nickname + ", race=" + race + ", color=" + color + ", type=" + type + ", age=" + age + ", tail=" + tail + ", energi=" + energi + '}';
    }

  

}
