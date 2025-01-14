package UniqueFindings;
import java.util.List;
//upper bound wild card--> generics
//List<? extends Number> list10
public class NumberUtils {

    // Method that takes a list of any type that extends Number
    public static double sumOfList(List<? extends Number> list) {
        double sum = 0.0;
        for (Number number : list) {
            sum += number.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        List<Double> doubles = List.of(1.1, 2.2, 3.3, 4.4);

        System.out.println("Sum of integers: " + sumOfList(integers)); // Outputs: 15.0
        System.out.println("Sum of doubles: " + sumOfList(doubles));   // Outputs: 11.0
    }
}
