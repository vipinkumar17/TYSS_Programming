package preprogramming;

public class ReverseTheWord {

	public static void main(String[] args) {
		String s = "Welcome To India Keep Safe";
		String[] str = s.split(" ");
		for(int i = str.length -1 ; i>=0 ; i--)
		{
			System.out.print(str[i] + " ");
		}
	}

} 
