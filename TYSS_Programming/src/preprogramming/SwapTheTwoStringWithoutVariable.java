package preprogramming;

public class SwapTheTwoStringWithoutVariable {
public static void main(String[] args) {
	String s1 = "Samosa";
	String s2 = "Kachori";
	
	s1 = s1 + s2;
	s2 = s1.substring(0, s1.length()-s2.length());
	s1 = s1.substring(s2.length());
	System.out.println("Swap of s1 is : " +s1);
	System.out.println("Swap of s2 is : " +s2);
}
}
