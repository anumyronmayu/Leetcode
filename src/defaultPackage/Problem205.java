package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Problem205 {

	public static boolean isIsomorphic(String s, String t) {

		/*if (s.length() != t.length()) {
			return false;
		}

		if (s.equals("") && t.equals("")) {
			return true;
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

		HashMap<Integer, Integer> map3 = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> map4 = new HashMap<Integer, Integer>();

		Set<Map.Entry<Character, Integer>> entrySet = map1.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {

			int amount = entry.getValue();

			if (map3.get(amount) == null) {
				map3.put(amount, 1);
			} else {
				map3.put(amount, map3.get(amount) + 1);
			}

		}

		Set<Map.Entry<Character, Integer>> entrySet2 = map2.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet2) {

			int amount = entry.getValue();

			if (map4.get(amount) == null) {
				map4.put(amount, 1);
			} else {
				map4.put(amount, map4.get(amount) + 1);
			}

		}

		if (map3.equals(map4)) {
			return true;
		} else {
			return false;
		}*/
		
		if (s.length() != t.length()) {
			return false;
		}

		if (s.equals("") && t.equals("")) {
			return true;
		}
		
		HashMap<Character, List<Integer>> map1 = new HashMap<Character, List<Integer>>();
		HashMap<Character, List<Integer>> map2 = new HashMap<Character, List<Integer>>();

		for(int i = 0; i < s.length(); i++){
			
			if(map1.get(s.charAt(i)) == null){
				
				List<Integer> list = new ArrayList<Integer>();
				list.add(i);
				map1.put(s.charAt(i), list);
				
			}else{
				
				map1.get(s.charAt(i)).add(i);
				
			}
			
		}
		
		for(int j = 0; j < t.length(); j++){
			
			if(map2.get(t.charAt(j)) == null){
				
				List<Integer> list = new ArrayList<Integer>();
				list.add(j);
				map2.put(t.charAt(j), list);
				
			}else{
				
				map2.get(t.charAt(j)).add(j);
				
			}
			
		}
		
		//boolean result = true;
	
		for(int k = 0; k < s.length(); k++){
			
			if(!map1.get(s.charAt(k)).equals(map2.get(t.charAt(k)))){
				return false;
			}
			
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		String a = "foo";
		String b = "bar";
		System.out.println(isIsomorphic(a, b));
	}

}
