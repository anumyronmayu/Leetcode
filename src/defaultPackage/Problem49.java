package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Problem49 {

	public static List<String> anagrams(String[] strs) {

		List<HashMap<Character, Integer>> list = new ArrayList<HashMap<Character, Integer>>();

		HashMap<HashMap<Character, Integer>, List<Integer>> indexMap = new HashMap<HashMap<Character, Integer>, List<Integer>>();

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

			if (indexMap.get(map) == null) {

				List<Integer> indexList = new ArrayList<Integer>();
				indexList.add(i);
				indexMap.put(map, indexList);

			} else {

				indexMap.get(map).add(i);

			}

		}

		System.out.println("List: " + list);
		System.out.println("IndexMap: " + indexMap);

		List<String> listOfString = new ArrayList<String>();

		Iterator<Map.Entry<HashMap<Character, Integer>, List<Integer>>> iterator = indexMap
				.entrySet().iterator();
		while (iterator.hasNext()) {
			Map.Entry<HashMap<Character, Integer>, List<Integer>> entry = iterator
					.next();

			if (entry.getValue().size() > 1) {

				for (int i : entry.getValue()) {

					listOfString.add(strs[i]);

				}
			}
		}

		return listOfString;

	}

	public static void main(String[] args) {

		String[] strs = new String[3];

		strs[0] = "ABD";
		strs[1] = "BAD";
		strs[2] = "DBA";

		System.out.println(anagrams(strs));

	}

}
