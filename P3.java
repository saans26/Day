/*
 * 11)Given two strings a and b, return a new string, following the rules given below.
If string b occurs in string a, then the new string should concatenate the characters that appear before and after of String b.
Ignore cases where there is no character before or after the word, and a character may be included twice if it is in between two string b's.
Example1)
i/p:abcXY123XYijk,XY
o/p:c13i
Example2)
i/p:XY123XY,XY
o/p:13
Example3)
i/p:XY1XY,XY
o/p:11
 */

package Day5;

public class P3 {

	public static void main(String[] args) 
	{
		String s ="Sanskruti";
		String s1 = "Jalte";
		String s2 = "";
		
		int l1 = s.length();
		int l2 = s1.length();
		int lmin = Math.min(l1, l2);
		
		for(int i=0;i<lmin;i++)
		{
			if(s.charAt(i)==s1.charAt(i))
			{
				
			}
		}

	}

}
