package week3.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String text = "madam";
		String revText= "";
		for (int i = text.length()-1; i >=0; i--) {
			char charAt = text.charAt(i);
			revText=revText+charAt;
		}
		System.out.println("Text: "+text);
		System.out.println("Reverse of text: "+ revText);
		if(text.equals(revText))
		{
			System.out.println("Given string is a palindrome");
		}
		else
		{
			System.out.println("Given string is not a palindrome");
		}
	}

}
