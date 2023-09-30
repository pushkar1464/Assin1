import java.util.*;
public class Q6{
		int facto( int n ) {
	    if (n != 0)  
	        return n * facto(n-1); 
	    else
	        return 1;
	    }
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number: ");
			int n = sc.nextInt();
			Q6 f = new Q6();
			System.out.println("Factorial of"+n+" is: "+f.facto(n));
		}
}
