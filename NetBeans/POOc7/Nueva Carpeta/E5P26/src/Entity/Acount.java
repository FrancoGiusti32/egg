package Entity;

public class Acount {
        public int acountNumber;
        public long DNI;
        public double currentBalence;

    public Acount() {
    }

    public Acount(int acountNumber, long DNI, double currentBalence, int interest) {
        this.acountNumber = acountNumber;
        this.DNI = DNI;
        this.currentBalence = currentBalence;
    }

    public int getAcountNumber() {
        return acountNumber;
    }

    public long getDNI() {
        return DNI;
    }

    public double getCurrentBalence() {
        return currentBalence;
    }

    public void setAcountNumber(int acountNumber) {
        this.acountNumber = acountNumber;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setCurrentBalence(double currentBalence) {
        this.currentBalence = currentBalence;
    }

    @Override
    public String toString() {
        return "Acount{" + "acountNumber=" + acountNumber + ", DNI=" + DNI + ", currentBalence=" + currentBalence + '}';
    }

}
