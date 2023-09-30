import java.util.*;


public class Q28 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int small=arr[0];
		for(int i=1;i<n;++i){
			if(arr[i]<small)
				small=arr[i];
		}
		System.out.println("Smallest number is: "+small);
		sc.close();
	}
}
