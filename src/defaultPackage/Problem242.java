package defaultPackage;

import java.util.HashMap;

public class Problem242 {

	public boolean isAnagram(String s, String t) {

		if (s.length() == 0 && t.length() == 0) {
			return true;
		} else if (s.length() == 0 && t.length() != 0) {
			return false;
		} else if (s.length() != 0 && t.length() == 0) {
			return false;
		}

		HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {
			if (map1.get(s.charAt(i)) == null) {
				map1.put(s.charAt(i), 1);
			} else {
				map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
			}
		}

		for (int j = 0; j < t.length(); j++) {
			if (map2.get(t.charAt(j)) == null) {
				map2.put(t.charAt(j), 1);
			} else {
				map2.put(t.charAt(j), map2.get(t.charAt(j)) + 1);
			}
		}

		if (map1.equals(map2)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
