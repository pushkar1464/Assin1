import java.util.*;


public class Q37 {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;


        while (number <= 100) {
            if (number % 2 == 0) {
                sum += number;
            }
            number++;
        }
        System.out.println("The sum of even numbers between 1 and 100 is: " + sum);
    }
}
