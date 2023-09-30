import java.util.*;
public class Q15 
{
	public static boolean ispalindrome(String input)
	{
		String rev = "";
		for(int i=input.length()-1 ; i>=0 ; i--)
		{
			rev = rev + input.charAt(i);
		}
		return input.equals(rev);
	}
	public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String");
		String input = sc.next();
		sc.close();
		
		if(ispalindrome(input))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	 }
}
