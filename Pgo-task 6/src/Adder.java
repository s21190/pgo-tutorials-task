import java.math.BigDecimal;
import java.util.ArrayList;

public class Adder {

    public int add(int a, int b) {
        return a + b;

    }

    public int add(ArrayList a) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {

            sum += (int) (a.get(i));

        }
        return sum;

    }
}