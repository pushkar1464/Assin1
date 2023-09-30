import java.util.*;


public class Q10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers to perform the operations of add, sub, mult and div: ");
		float num1 = sc.nextFloat();
		float num2 = sc.nextFloat();
		System.out.println("Addition of the two numbers is: "+ (num1+num2));
		System.out.println("\nSubtraction of the two numbers is: "+ (num1-num2));
		System.out.println("\nMultiplication of the two numbers is: "+ (num1*num2));
		System.out.println("\nDivision of the two numbers is: "+ (num1/num2));
		sc.close();

	}


}
