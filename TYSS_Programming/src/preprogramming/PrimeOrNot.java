package preprogramming;
import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) 
	{
		System.out.println("Enter the Number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int dc =1;
		for(int i=1 ; i<=n/2 ; i++)
		{
			if(n%i==0)
			{
				dc++;
			}
		}
		if(dc==2)
		{
			System.out.println(n + " is prime number ");
		}
		else
		{
			System.out.println(n + " is not a prime number ");
		}
	}
}
