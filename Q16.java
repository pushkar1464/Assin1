import java.util.*;
import java.math.*;
public class Q16{
	public static void main(String args[]) {		
		float n1 = 3.5f;
		float n2 = 6.2f;
		float sum = n1+n2;
		System.out.print("Sum of two float numbers "+n1+" and "+n2+" is: "+sum);
		
		double n3 = 5.32;
		double n4 = 2.63;
		double sum1 = n3+n4;
		System.out.print("\nSum of two double numbers "+n3+" and "+n4+" is: "+sum1);
		
		BigDecimal n5 = new BigDecimal(0.3);
		BigDecimal n6 = new BigDecimal(0.7);
		BigDecimal sum2 = n5.add(n6);
		System.out.print("\n\nSum of two BigDecimal numbers "+n5+" and\n"+n6+" is: "+sum2);
	}
}
