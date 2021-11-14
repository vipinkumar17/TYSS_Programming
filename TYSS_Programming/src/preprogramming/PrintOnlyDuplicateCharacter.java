package preprogramming;

import java.util.HashSet;

public class PrintOnlyDuplicateCharacter {

	public static void main(String[] args) {
		String s = "samosa";
		//Step1 : Create a Set collection and all the characterss of given String into Set
		HashSet<Character> set = new HashSet();
		for(int i =0 ; i<s.length() ; i++)
		{
			set.add(s.charAt(i));
		}
		//Step:2 Compare each character of Set with all character of the given String
		for(Character ch : set)
		{
			int count = 0;
			//compare with each charater and increase the count
			for(int i=0 ; i<s.length() ; i++)
			{
				if(ch==s.charAt(i))
				{
					count++;
				}
			}
			// Step 3 : print both char of set and count
			if(count>1)			//print only duplication
			{
				System.out.println(ch+" = "  +count);
			}
		}

	}

}
