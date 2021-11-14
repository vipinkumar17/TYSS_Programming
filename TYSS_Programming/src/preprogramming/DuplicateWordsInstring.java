package preprogramming;

import java.util.HashSet;

public class DuplicateWordsInstring {

	public static void main(String[] args) {
		String s = "My Life My Rules";

		String[] str = s.split(" ");
		//Step 1 : Create a set collection and add all the String array values into Set
		HashSet<String> set = new HashSet<>();
		for(int i=0 ; i<str.length ; i++)
		{
			set.add(str[i]);
		}
		// compare each String value of Set With All the Value Of String Array
		for(String word:set)
		{
			int count = 0;
			for(int i=0 ; i<str.length;i++)
			{
				if(word.equals(str[i]))
				{
					count++;
				}
			}
			//Step 3 : Print both word and count
			if(count>1)
			System.out.println(word +" - " +count);
		}
	}

}
