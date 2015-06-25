package defaultPackage;

import java.util.HashMap;

public class Problem137 {

	public static int singleNumber(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) == null) {
				map.put(nums[i], 0);
			} else if (map.get(nums[i]) == 0) {
				map.put(nums[i], 1);
			} else {
				map.put(nums[i], 2);
			}

		}

		for (int j = 0; j < nums.length; j++) {

			if (map.get(nums[j]) == 0) {
				return nums[j];
			}

		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
