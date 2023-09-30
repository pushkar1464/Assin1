import java.util.*;
public class Q17{
	public static void main(String[] args) {
		int count=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string: ");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch =='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U') {
				count++;
			}
		}
		System.out.println("There are "+count+" vowels in the entered string!");
	}
}
