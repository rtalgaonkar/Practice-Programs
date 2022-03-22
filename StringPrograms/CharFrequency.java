package StringPrograms;

public class CharFrequency {

	public static void main(String[] args) {
		String str = "aabbbccdddd";
		char prev = str.charAt(0);
		int count = 1;
		for(int i=1;i<str.length();i++) {
			if(prev == str.charAt(i)) {
				count++;
			}
			else {
				System.out.println(prev + "" + count);
				prev = str.charAt(i);
				count = 1;
			}
		}
		System.out.println(prev + "" + count);
		
	}
}
