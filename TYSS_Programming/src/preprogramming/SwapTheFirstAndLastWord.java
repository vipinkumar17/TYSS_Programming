package preprogramming;

public class SwapTheFirstAndLastWord {

	public static void main(String[] args) {
		String s = "Welcome To India Keep Safe";
		String[] str = s.split(" ");
		String temp = str[0];
		str[0] = str[str.length - 1];
		str[str.length -1 ] = temp;
		for(int i=0 ; i<str.length ; i++)
		{
			System.out.print(str[i] + " ");
		}
	}

}
