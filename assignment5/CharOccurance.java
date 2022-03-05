package week3.day1.assignments;

public class CharOccurance {

	public static void main(String[] args) {
		String str = "welcome to chennai";
		int count=0;
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='e')
			{
				count=count+1;
			}
		}
		System.out.println("Number of e in given string is: "+count);
	}
	
	
	/*
	 * Below also works
	 * for (int i = 0; i < str.length(); i++) {
	 * if(str.charAt(i)=='e') {
	 * count=count+1;
	 *  } }
	 */
	 
}
