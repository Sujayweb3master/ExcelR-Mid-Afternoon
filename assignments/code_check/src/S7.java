import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class S7 {
        public static void main(String[] args) throws ParseException {
                double num1 = 385897.88888888;
                System.out.println(num1);
                NumberFormat nf = NumberFormat.getInstance(Locale.ITALY);
                String s1 = nf.format(num1);
                double num2 = (Double) nf.parse(s1);
                System.out.println(s1);
                System.out.println(num2);
        }
}