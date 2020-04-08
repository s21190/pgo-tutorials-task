import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

 Adder s1= new Adder();
Address f1= new Address();
Multiplier b1 = new Multiplier();
BigDecimal num = new BigDecimal("50");
        BigDecimal num1 = new BigDecimal("10");

        ArrayList<Integer> a =new ArrayList<Integer>();
    a.add(7); a.add(13); a.add(30);




    System.out.println(s1.add(6,4));
        System.out.println(b1.multiply(2,2,2,2));
    System.out.println(s1.add(a));
        System.out.println(b1.multiply(num, num1));
        System.out.println(f1.createAddress("nigeria","lagos","462-744","dhskkdhs",374303));
    }
}
