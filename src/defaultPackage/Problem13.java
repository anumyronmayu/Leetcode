package defaultPackage;

import java.util.HashMap;

public class Problem13 {

	public static int romanToInt(String s) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);

		if (s.length() == 0) {
			return 0;
		}

		if (s.length() == 1) {
			return map.get(s);
		}

		String front;
		String back;

		int main;

		int i = 0;
		int j;
		int k = 0;

		while ((i + 1) <= s.length() - 1
				&& map.get(String.valueOf(s.charAt(i))) <= map.get(String
						.valueOf(s.charAt(i + 1)))) {

			if (map.get(String.valueOf(s.charAt(i))) == map.get(String
					.valueOf(s.charAt(i + 1)))) {
				k++;
			} else {
				k = 0;
			}

			i++;

		}

		j = i - k;

		if (j - 1 >= 0) {
			front = s.substring(0, j);
		} else {
			front = "";
		}

		if (i + 1 <= s.length() - 1) {
			back = s.substring(i + 1, s.length());
		} else {
			back = "";
		}

		main = map.get(String.valueOf(s.charAt(i))) * (i - j + 1);

		return main - romanToInt(front) + romanToInt(back);
	}

	public static void main(String[] args) {

		String s = "MCD";
		System.out.println(romanToInt(s));

	}

}
