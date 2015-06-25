package defaultPackage;

import java.util.HashMap;

public class Problem217 {

	public static boolean containsDuplicate(int[] nums) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (map.get(nums[i]) == null) {
				map.put(nums[i], 0);
			} else {
				return true;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
