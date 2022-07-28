/*
 * 9) Given two strings, a and b, print a new string which is made of the following combination-first character of a, the first character of b, second character of a, second character of b and so on.
Any characters left, will go to the end of the result.
Example1)
i/p:Hello,World
o/p:HWeolrllod
 */

package Day5;

public class P1 {

	public static void main(String[] args) 
	{
		String s = "Hello";
		String s1 = "World";
		String s2 = "";
		
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<=i;j++)
			{
				if(j==i)
				{
				s2=s2+s.charAt(i)+s1.charAt(j);
				}
			}
			System.out.println(s2);
		}

	}

}
