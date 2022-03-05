package week3.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "stops";
		String text2 = "potss";
		boolean flag=false;
		if(text1.length()==text2.length()) {
			char[]	c1= text1.toCharArray();
			char[]	c2= text2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			flag = Arrays.equals(c1, c2);
		}
		
		if(flag==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an Anagram");
		}
	}
}
