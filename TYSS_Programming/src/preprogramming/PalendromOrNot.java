package preprogramming;

import java.util.Scanner;

public class PalendromOrNot {
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int rev = 0;
		int t=n;
		while(n>0)          //while(n!=0)       
		{
			int r = n%10 ; 
			rev = rev*10 +r;
			n=n/10;
		}
		if(t==rev)
		{
			System.out.println(t + " is a Palendrom Number");
		}
		else
		{
			System.out.println(t + " is not a Palendrom Number");
		}
	}
}
