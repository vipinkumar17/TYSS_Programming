package preprogramming;

import java.util.Scanner;

public class SumOfDigitOfNumber {

	public static void main(String[] args) 
	{
		System.out.println("Entet the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0;
		do {
			int r = n%10;
			sum = sum+r;
			n=n/10;
		}
		while(n!=0);
		System.out.println(sum); 
	}
}

