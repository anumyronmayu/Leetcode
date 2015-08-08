package defaultPackage;

public class Problem238 {

	public int[] productExceptSelf(int[] nums) {

		int[] leftToRight = new int[nums.length];
		int[] rightToLeft = new int[nums.length];

		leftToRight[0] = nums[0];
		rightToLeft[nums.length - 1] = nums[nums.length - 1];

		for (int i = 1; i <= nums.length - 1; i++) {
			leftToRight[i] = leftToRight[i - 1] * nums[i];
		}

		for (int j = nums.length - 2; j >= 0; j--) {
			rightToLeft[j] = rightToLeft[j + 1] * nums[j];
		}

		int[] results = new int[nums.length];

		results[0] = rightToLeft[1];
		results[results.length - 1] = leftToRight[nums.length - 2];

		for (int k = 1; k <= nums.length - 2; k++) {
			results[k] = leftToRight[k - 1] * rightToLeft[k + 1];
		}

		return results;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
