import java.util.*;
public class Q27 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 3 values to be checked: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1>num2 && num2>num3)
			System.out.println("The integers entered are in decreasing order!");
		else if(num1<num2 && num2<num3)
			System.out.println("The integers are in increasing order!");
		else
			System.out.println("The integers are neither in increasing nor in decreasing order!");
		sc.close();
	}
}
