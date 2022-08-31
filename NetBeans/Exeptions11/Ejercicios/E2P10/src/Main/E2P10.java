package Main;


public class E2P10 {

    public static void main(String[] args) {
       int[] Array = new int[3];
       
        try {
            Array[4]=3;
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This array index don't exist");
        }
       
    }


}
