
//Java programme to convert this string AABBCA to A2B2C1A1
package StringPrograms;

public class StringConversion {

	public static void main(String[] args) {
		String str = "AABBCA";
		char prev = str.charAt(0);
		int count = 1;
		StringBuilder strNew = new StringBuilder();
		for(int i=1;i<str.length();i++) {
			if(prev == str.charAt(i)) {
				count++;
			}
			else {
				strNew.append(prev).append(count);
				count = 1;
				prev = str.charAt(i);
			}
		}
		strNew.append(prev).append(count);
		System.out.println(strNew.toString());
	}
}
