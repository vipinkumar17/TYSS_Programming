package preprogramming;

public class ReverseTheStringWithoutVariable {

	public static void main(String[] args) {
		String s = "Ayurvedic";
		for(int i =s.length()-1 ; i>=0 ; i--)
		{
			System.out.print(s.charAt(i));
		}
	}
}
