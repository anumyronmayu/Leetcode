package defaultPackage;

import java.util.Map;

public class Problem38 {

	public static String countAndSay(int n) {
		
		if(n == 0){
			return "";
		}

		String s = "1";

		for (int k = 0; k < n - 1; k++) {

			StringBuffer sb = new StringBuffer();

			char current = s.charAt(0);
			int numOfCurrentChar = 0;

			for (int i = 0; i < s.length(); i++) {

				if (s.charAt(i) == current) {
					numOfCurrentChar++;
				} else {

					sb.append(String.valueOf(numOfCurrentChar)
							+ String.valueOf(current));

					current = s.charAt(i);
					numOfCurrentChar = 1;

				}

			}

			sb.append(String.valueOf(numOfCurrentChar)
					+ String.valueOf(current));

			s = sb.toString();

		}

		return s;

	}

	public static void main(String[] args) {

		System.out.println(countAndSay(4));

	}

}
