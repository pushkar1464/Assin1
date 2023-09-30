import java.util.*;


public class Q43 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and breadth");
		float len = sc.nextFloat();
		float bre = sc.nextFloat();
		System.out.println("Area of the rectangle is: "+(len*bre));
		System.out.println("Perimeter of the rectangle is: "+(2*(len+bre)));
	}


}
