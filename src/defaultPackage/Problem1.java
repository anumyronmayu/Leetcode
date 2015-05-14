package defaultPackage;

import java.util.HashMap;

public class Problem1 {

	public int[] twoSum(int[] numbers, int target) {

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

	public static void main(String args[]) {

	}

}
