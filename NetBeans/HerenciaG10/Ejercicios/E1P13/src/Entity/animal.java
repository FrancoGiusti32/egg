package Entity;

public class animal {
    
    protected String name;
    protected String food;
    protected String race;
    protected Integer age;

    public animal(String name, String food, String race, Integer age) {
        this.name = name;
        this.food = food;
        this.race = race;
        this.age = age;
    }
        
    
    public animal() {
    }
    
    public void food(){
        System.out.println("this animal eats "+food);
    }
    
}
