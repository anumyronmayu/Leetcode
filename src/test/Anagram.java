package test;

import java.util.HashMap;

public class Anagram {

	public static boolean isAnagram(String a, String b) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (int i = 0; i < a.length(); i++) {

			if (map.get(a.charAt(i)) == null) {
				map.put(a.charAt(i), 1);
			} else {
				map.put(a.charAt(i), map.get(a.charAt(i)) + 1);
			}

		}

		HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();

		for (int j = 0; j < b.length(); j++) {

			if (map2.get(b.charAt(j)) == null) {
				map2.put(b.charAt(j), 1);
			} else {
				map2.put(b.charAt(j), map2.get(b.charAt(j)) + 1);
			}

		}

		if (map.equals(map2)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		
		String a = "god";
		String b = "dog1";
		
		System.out.println(isAnagram(a, b));

	}

}
