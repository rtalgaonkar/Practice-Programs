package StringPrograms;

public class Permutation {

	public static void main(String[] args) {
		String str = "123";
		permutations("",str);
	}

	private static void permutations(String string, String str) {
		if(str == "")
			System.out.println(string);
		else {
			for(int i=0;i<str.length();i++) {
				permutations(string+str.charAt(i), str.substring(0,i)+str.substring(i+1,str.length()));
			}
		}
	}
}
