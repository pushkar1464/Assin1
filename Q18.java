import java.util.*;


public class Q18 {
	
	public static float carea(float r){
	    float area = 3.14f*r*r;
	    System.out.println("Area of circle is: "+area);
		return area;
	}
	
	public static float cvol(float r) {
		float volume = (4*3.14f*r*r*r)/3 ;
		System.out.println("Volume of the circle is: "+volume);
		return volume;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		float rad = sc.nextFloat();
		System.out.println("Enter your choice: ");
		System.out.println("1) Area of the circle");
		System.out.println("2) Volume of the circle");
		int c = sc.nextInt();
		switch(c) {
		case 1: 
			carea(rad);
			break;
		case 2:
			cvol(rad);
			break;
		}
	}
	
}
