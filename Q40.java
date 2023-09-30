import java.util.*;


public class Q40 {
	void palindrome(String input){
		String rev = "";


		for(int i=input.length()-1; i>=0; i--) {
			rev = rev+input.charAt(i);
		}
		if(input.equals(rev)) {
			System.out.println("String is a palindrome");
		}
		else
			System.out.println("String is not a palindrome");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your string: ");
		String input = sc.next();
		Q40 p = new Q40();
		p.palindrome(input);
		
	}
}
