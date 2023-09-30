import java.util.*;
public class Q2 {
		public static void main(String [] args) {
			Scanner sc = new Scanner(System.in);
			String str, revstr="";
			
			System.out.println("enter your string: ");
			str=sc.nextLine();
			
			for(int i =str.length()-1; i>=0; i--) {
				revstr+= str.charAt(i);
			}
			System.out.println("str rev is: "+revstr);
		}
	}
