import java.util.*;


public class Q26 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a==b && b==c && a==c) {
			System.out.println("Entered integers are same");
		}
		else if(a!=b && b!=c && a!=b) {
			System.out.println("Entered integers are not same");
		}
		else
			System.out.println("Neither all are equal or different");
		sc.close();
	}
}
