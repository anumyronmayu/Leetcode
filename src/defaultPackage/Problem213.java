package defaultPackage;

public class Problem213 {

	public static int rob(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		int[] result = new int[nums.length + 1];

		boolean[] inOrNot = new boolean[nums.length + 1];

		result[0] = 0;
		result[1] = nums[0];

		for (int i = 2; i < result.length; i++) {

			if (result[i - 1] > (result[i - 2] + nums[i - 1])) {
				result[i] = result[i - 1];
				inOrNot[i] = false;

				if (i == 2) {
					inOrNot[1] = true;
				}

			} else {
				result[i] = result[i - 2] + nums[i - 1];
				inOrNot[i] = true;

				if (i == 2) {
					inOrNot[1] = false;
				}
			}

		}
		
		System.out.println(inOrNot[1]);
		System.out.println(inOrNot[2]);
		System.out.println(inOrNot[3]);

		if (inOrNot[1] == true && inOrNot[result.length - 1] == true) {
			if (nums[0] < nums[nums.length - 1]) {
				return (result[result.length - 1] - nums[0]);
			} else {
				return (result[result.length - 1] - nums[nums.length - 1]);
			}
		} else {
			return result[result.length - 1];
		}

	}

	public static void main(String[] args) {

		int[] test = { 2, 3, 2 };
		System.out.println(rob(test));

	}

}
