import java.util.*;


public class Q25 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		if(n>0)
			System.out.println(+n+" is a positive integer");
		else if(n<0)
			System.out.println(+n+" is a negative integer");
		else
			System.out.println(+n+" is a zero number");
		sc.close();
	}
}
