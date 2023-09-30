import java.util.*;


public class Q45 {
	public static void main(String[] args) {
		int n, sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n1 = sc.nextInt();
		while(n1>0) {
			n = n1%10;
			sum+= n;
			n1/=10;	
		}
		System.out.println("Addition of the number is: "+sum);
	}


}
