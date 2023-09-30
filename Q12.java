import java.util.*;


public class Q12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1) Convert Celcius to Farhenrite");
		System.out.println("2) Convert Farhenrite to Celcius ");
		
		System.out.println("Enter your choice: ");
		int opt = sc.nextInt();
		
		switch(opt) {
		case 1: System.out.println("Enter the temperature in Celcius: ");
				float far = sc.nextFloat();
				far = (far * 1.8f) + 32;
				System.out.println("Temperature value obtained is: "+far);
					break;
		case 2: System.out.println("Enter the temperature in Farhenrite: ");
				float cel = sc.nextFloat();
				cel = ((cel * 5)/8)  - 32;
				System.out.println("Temperature value obtained is: "+cel);
				break;
		}
		sc.close();
	}


}
