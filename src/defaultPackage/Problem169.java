package defaultPackage;

import java.util.HashMap;

public class Problem169 {

	public static int majorityElement(int[] nums) {

		if (nums.length == 1) {
			return nums[0];
		}

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) == null) {
				map.put(nums[i], 1);
			} else {
				int temp = map.get(nums[i]) + 1;
				if (temp > (int) Math.floor(nums.length / 2)) {
					return nums[i];
				}
				map.put(nums[i], temp);
			}

		}

		return 0;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
