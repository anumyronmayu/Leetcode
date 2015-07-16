package defaultPackage;

public class Problem153 {

	public int findMin(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		if (nums[nums.length - 1] >= nums[0]) {
			return nums[0];
		}

		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int mid;

		while (low <= high) {

			mid = (low + high) / 2;

			if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
				return nums[mid];
			}

			if (mid == low) {
				return Math.min(nums[low], nums[high]);
			} else if (nums[mid] > nums[low]) {
				low = mid;
			} else {
				high = mid;
			}
		}

		return -1;
	}

	public int findMin2(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}

		if (nums[nums.length - 1] >= nums[0]) {
			return nums[0];
		}

		int n = nums.length;
		int low = 0;
		int high = n - 1;

		return binarySearch(nums, low, high);

	}

	public int binarySearch(int[] nums, int low, int high) {

		if (low <= high) {

			int mid = (low + high) / 2;

			if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
				return nums[mid];
			}

			if (mid == low) {
				return Math.min(nums[low], nums[high]);
			} else if (nums[mid] > nums[low]) {
				return binarySearch(nums, mid, high);
			} else {
				return binarySearch(nums, low, mid);
			}

		} else {
			return -1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
