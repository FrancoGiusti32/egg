package e3p22;
import Service.studenService;
public class E3P22 {

    public static void main(String[] args) {
        studenService st=new studenService();
        st.createStudent();
        System.out.println("the final note of: ");
        System.out.println(st.finalNote());
    }
    
}
