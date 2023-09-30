import java.util.*;


public class Q35 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number whose table is to be printed: ");
		int num = sc.nextInt();
		System.out.println("Table of " +num+ " is:");
		
		for(int i=1; i<=10; i++) {
			System.out.println(num*i);
		}
	}


}
