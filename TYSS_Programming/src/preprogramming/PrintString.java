package preprogramming;

public class PrintString {

	public static void main(String[] args) {
		String s = "Database";
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			res=res+s.charAt(i);
			System.out.println(res);
		}
	}
}
