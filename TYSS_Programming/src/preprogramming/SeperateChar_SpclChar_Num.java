package preprogramming;

public class SeperateChar_SpclChar_Num {

	public static void main(String[] args) {
		String s = "a1!b2@c3#d4$e5%f6*";
		String alpha ="";
		String num = "";
		String spchar = "";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)>='Z' || s.charAt(i)>='a' && s.charAt(i)>='z')
			{
				alpha = alpha + s.charAt(i);
			}
			else if (s.charAt(i)>='0' && s.charAt(i)<='9') {
				num = num + s.charAt(i);
			}
			else
			{
				spchar = spchar + s.charAt(i);
			}
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spchar);
	}

}
