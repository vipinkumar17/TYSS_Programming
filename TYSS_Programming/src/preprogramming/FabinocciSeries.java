package preprogramming;

import java.util.Scanner;

public class FabinocciSeries {

	public static void main(String[] args) {
		
		int f1 = 0;
		int f2 = 1;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while(n>0)
		{
			System.out.print(f1+" ");
			int f3 = f1+f2;
			f1=f2;
			f2=f3;
			n--;
		}
	}
}
