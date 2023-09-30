import java.util.*;


public class Q39 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int large, small;
		System.out.println("Enter the value for n: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the "+n+" values");
		for(int i=0;i<n;++i) {
			arr[i]=sc.nextInt();
		}
		large=small=arr[0];
		for(int i=1;i<n;++i) {
			if(arr[i]>large)
				large=arr[i];
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("The largest and the smallest number is: \n"+"Large: "+large+"\nSmall: "+small);
		
	}	
}
