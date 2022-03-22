package StringPrograms;

public class LongestPalindromeInString {
	public static void main(String[] args) {
		String str = "forgeeksskeegfor";
		System.out.println("Longest palindrome is: " + longestPalindrome(str));
	}

	private static String longestPalindrome(String str) {
		int n = str.length();
		int maxLength = 1, start=0;
		for(int i=0;i<n;i++) {
			int low = i-1;
			int high = i+1;
			while(high<n && (str.charAt(high) == str.charAt(i)))
				high++;
			while(low>=0 && (str.charAt(low) == str.charAt(i)))
				low--;
			while(low>=0 && high<n && (str.charAt(low) == str.charAt(high))) {
				high++;
				low--;
			}
			int length = high-low-1;
			if(maxLength < length) {
				maxLength = length;
				start = low+1;
			}
			
		}
		return str.substring(start, start+maxLength);
	}

}
