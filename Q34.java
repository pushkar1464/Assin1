import java.util.*;


public class Q34 {
	public static void main(String args[]) {
		String password = "password123";
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Enter the password: ");
			String pass = sc.next();
			if(pass.equals(password)) {
				System.out.println("Password is correct!");
				break;
			}
			else
				System.out.println("Password is incorrect");
		}while(true);
	}
}
