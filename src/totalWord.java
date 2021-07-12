
public class totalWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	String s = “saveChangesInTheEditor” contains 5 different words.
				//String s2 = “singleword” contains only 1 word.
				//String s3 = “welcomeToSelenium” contains 3 different words
		System.out.println(totalWords("saveChangesInTheEditor"));
		System.out.println(totalWords("singleword"));
		System.out.println(totalWords("welcomeToSelenium"));
	}

	
	public static int totalWords(String s)
	{
		int count = 1;
		for(int i = 0; i<s.length();i++)
		{
			char c = s.charAt(i);
			if (Character.isUpperCase(c)) {
				count++;
			}
			
		}
		return count;
	}
}
