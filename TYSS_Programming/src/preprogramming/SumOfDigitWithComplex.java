package preprogramming;

public class SumOfDigitWithComplex {

	public static void main(String[] args) {
			int n = 1784;
			while(n>9)
			{
				int sum = 0;
				while(n>0)
				{
					int r = n%10;
					sum = sum + r;
					n=n/10;
				}
				n=sum;
			}
			System.out.println(n);
	}

}
