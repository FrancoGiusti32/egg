package Store.Entity;

public class product {

    private Integer code;
    private Double price;
    private String name;
    private Integer manufacterCode;

    public product() {
    }

    
    
    public product(double price, String name, int manufacterCode) {
        this.price = price;
        this.name = name;
        this.manufacterCode = manufacterCode;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getManufacterCode() {
        return manufacterCode;
    }

    public void setManufacterCode(Integer manufacterCode) {
        this.manufacterCode = manufacterCode;
    }

    
  
    @Override
    public String toString() {
        return "product"  +code+ ", price= " + price + ", name = " + name + ", manufacterCode = " + manufacterCode + '}';
    }

}
