import java.util.*;
public class Q31
{
	public static void main(String args[]) {
		int num1=0, num2=1, n, fibo=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		n = sc.nextInt();
		System.out.println("Fibonacci series for "+n+" values is: ");
		for(int i =1; i<=n; ++i) {
			System.out.print(num1+" ");
			fibo = num1+num2;
			num1=num2;
			num2=fibo;
		}
	}
}
