package week3.day1.assignments;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] strarr = test.split(" ");
		for (int i = 0; i < strarr.length; i++) {
			if(i%2!=0)
			{
				char[] charArray = strarr[i].toCharArray();
				for (int j = charArray.length-1; j >= 0; j--) {
					System.out.print(charArray[j]);
				}
				System.out.print(" ");
			}
			else {
				System.out.print(strarr[i]+" ");
			}
			
		}

	}

}
