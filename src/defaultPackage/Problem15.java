package defaultPackage;

import java.util.HashMap;
import java.util.List;

public class Problem15 {

	public static int[] twoSum(int[] numbers, int target) {

		int[] index = { 0, 0 };

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < numbers.length; i++) {

			map.put(numbers[i], i);

		}

		for (int i = 0; i < numbers.length; i++) {

			int search = target - numbers[i];

			if (map.get(search) != null && map.get(search) != i) {

				index[0] = i + 1;
				index[1] = map.get(search) + 1;
				return index;

			}
		}

		return index;

	}

	public static List<List<Integer>> threeSum(int[] nums) {
		
		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
