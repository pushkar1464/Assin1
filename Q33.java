import java.util.*;


public class Q33 {
	public static void main(String args[]){
		int j;
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter the end range: ");
		int end = sc.nextInt();
		System.out.println("Following are the prime numbers in the range 2 - "+end+":\n");
		
		for(int i=2; i<=end;i++) {
			boolean isprime=true;
			for(j=2;j*j<=i;j++) {
				if(i%j==0) {
					isprime=false;
					break;
				}
			}
			if(isprime)
				System.out.print(" "+i);
		}
		
	}
}
