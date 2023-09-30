import java.util.*;


public class Q20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();
		if(n1>n2 && n1>n3) {
			System.out.println(+n1+" is the greatest");
		}
		else if(n2>n3 && n2>n1) {
			System.out.println(+n2+" is the greatest");
		}
		else 
			System.out.println(+n3+" is the greatest");
		sc.close();
	}


}
