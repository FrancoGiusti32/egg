package Entity;

public class NIF {

    public Integer DNI;
    public String letter;

    public NIF() {
    }

    public Integer getDNI() {
        return DNI;
    }

    public String getLetter() {
        return letter;
    }

    public void setDNI(Integer DNI) {
        this.DNI = DNI;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return "NIF{"+ DNI + "-" + letter + '}';
    }
    
    

}
