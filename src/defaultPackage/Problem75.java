package defaultPackage;

public class Problem75 {

	public void sortColors(int[] nums) {

		int num0 = 0;
		int num1 = 0;
		int num2 = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				num0++;
			}

			if (nums[i] == 1) {
				num1++;
			}

			if (nums[i] == 2) {
				num2++;
			}
		}

		for (int i = 0; i < num0; i++) {
			nums[i] = 0;
		}

		for (int i = num0; i < num0 + num1; i++) {
			nums[i] = 1;
		}

		for (int i = num0 + num1; i < nums.length; i++) {
			nums[i] = 2;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
