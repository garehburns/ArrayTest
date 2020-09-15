package arraytest;
import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {

        int[] smallPrimes = {2, 3, 5, 7};
        int[] smallPrimesCopy = Arrays.copyOf(smallPrimes, 2);
        
        for (int i = 0; i < smallPrimesCopy.length; i++) {
            System.out.print(smallPrimesCopy[i] + " ");
        }

        if (args.length >= 2) {
            
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            
            System.out.print("Sum: " + (a + b));
            
        }
    }
}
