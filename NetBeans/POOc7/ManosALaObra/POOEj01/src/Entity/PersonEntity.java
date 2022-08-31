package Entity;
import java.util.Date;

public class PersonEntity {
    public String name;
    public boolean isFriend;
    public double hight;

    public PersonEntity() {
    }

    public PersonEntity(String name, boolean isFriend, int hight) {
        this.name = name;
        this.isFriend=isFriend;
        this.hight = hight;
    }

    public String getName() {
        return name;
    }

    public boolean isIsFriend() {
        return isFriend;
    }

    public double getHight() {
        return hight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsFriend(boolean isFriend) {
        this.isFriend = isFriend;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }

    @Override
    public String toString() {
        return "PersonEntity{" + "name=" + name + ", isFriend=" + isFriend + ", hight=" + hight + '}';
    }

    
    
}
