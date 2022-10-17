package Store.Entity;

public class manufacturer {

    private Integer code;
    private String name;

    public manufacturer() {
    }

    
    
    public manufacturer(String name) {
        this.name = name;
    }

    
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
