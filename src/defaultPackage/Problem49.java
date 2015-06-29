package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem49 {

	public static List<String> anagrams(String[] strs) {

		List<HashMap<Character, Integer>> list = new ArrayList<HashMap<Character, Integer>>();

		for (int i = 0; i < strs.length; i++) {

			HashMap<Character, Integer> map = new HashMap<Character, Integer>();

			for (int j = 0; j < strs[i].length(); j++) {

				if (map.get(strs[i].charAt(j)) == null) {
					map.put(strs[i].charAt(j), 1);
				} else {
					map.put(strs[i].charAt(j), map.get(strs[i].charAt(j)) + 1);
				}

			}

			list.add(map);

		}

		List<List<HashMap<Character, Integer>>> listOfList = new ArrayList<List<HashMap<Character, Integer>>>();

		for (HashMap<Character, Integer> map : list) {

			for(List<HashMap<Character, Integer>> cluster : listOfList){
				
				if(cluster.get(0).equals(map)){
					
				}
				
			}
			
		}

		return null;

	}

	public static void main(String[] args) {

		String[] strs = new String[3];

		strs[0] = "ABD";
		strs[1] = "BAD";
		strs[2] = "DBA";

		System.out.println(anagrams(strs));

	}

}
