import java.util.Scanner;
public class Q1
{
	public static void main(String[] args)
	{
		System.out.println("Enter the length: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		System.out.println("Enter the breadth: ");
		
		int b = sc.nextInt();
		
		System.out.println("Enter Your choice number: ");
		
		int s = sc.nextInt();
		switch(s)
		{
			case 1:
				int area = a * b ;
				System.out.println("The Area of the rectangle is: " + area);
				break;
				
			case 2:
				float area1 = ( a * b ) / 2 ;
				System.out.println("The Area of the triangle is: " + area1);
				
			default:
				break;
		}
		sc.close();
	}
}