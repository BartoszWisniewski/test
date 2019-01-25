import java.math.BigDecimal;
import java.math.RoundingMode;

public class PitoNDecimalPlaces {
    public static void main(String[] args) {
        int num = 5;

        System.out.println(myPi(num));

    }
    public static double myPi(int num) {

      double result = BigDecimal.valueOf(Math.PI).setScale(num, RoundingMode.HALF_UP).doubleValue();
       return result;
    }
}
