import java.util.*;
public class Q8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers to perform avg function: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		double avg = (num1+num2+num3)/3;
		System.out.println("Avg of the numbers is: "+avg);
	}
}