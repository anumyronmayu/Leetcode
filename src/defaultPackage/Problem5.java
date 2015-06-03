package defaultPackage;

public class Problem5 {

	public static String longestPalindrome(String s) {

		String S1 = s;
		String S2 = s;
		
		for(int i = 0; i < s.length(); i ++){
			
			S2 = S2.replace(S2.charAt(i), S1.charAt(s.length() - i - 1));
			
		}
		
		int Start = 0;
		int Max = 0;
		for (int i = 0; i < S1.length(); i++) {
			for (int j = 0; j < S2.length(); j++) {
				int x = 0;
				while (S1.charAt(i + x) == S2.charAt(j + x)) {
					x++;
					if (((i + x) >= S1.length()) || ((j + x) >= S2.length()))
						break;
				}
				if (x > Max) {
					Max = x;
					Start = i;
				}
			}
		}
		return S1.substring(Start, (Start + Max));

	}

	public static void main(String[] args) {

		String A = "ABCDE";
		String B = "BCE";
		
		//System.out.println

	}

}
