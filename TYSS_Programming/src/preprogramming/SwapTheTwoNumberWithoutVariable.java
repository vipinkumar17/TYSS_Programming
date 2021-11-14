package preprogramming;

public class SwapTheTwoNumberWithoutVariable {
public static void main(String[] args) {
	int a = 14;
	int b= 54;
	
	a=a+b;
	b=a-b;
	a =a-b ; 
	System.out.println("Swap of a is : "+a);
	System.out.println("Swap of b is : "+b);
}
}
