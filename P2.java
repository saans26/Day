/*
 * 10)Given a string and an integer n, print a new string made of n repetitions of the last n characters of the string.
You may assume that n is between 0 and the length of the string, inclusive.
Example1)
i/p:Hello,3
o/p:llollollo
 */

package Day5;

public class P2 {

	public static void main(String[] args) 
	{
		String s = "sanskru";
		String s1 = "";
		int n = 3;
		int l = s.length()-n;
		//System.out.println(l);
		for(int i=l;i>(l-1);i++)
		{
			if(i<s.length())
			{
				s1 = s1 + s.charAt(i);
			}
		}
		for(int k = 0;k<n;k++)
		{
			System.out.print(s1);
		}

	}

}
