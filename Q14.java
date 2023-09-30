import java.util.*;
public class Q14 {
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number to be converted: ");
		double n = sc.nextDouble();
		
		int result = (int)Math.round(n);
		System.out.println("Converted result obtained is: "+result);	
		sc.close();
	}
}
