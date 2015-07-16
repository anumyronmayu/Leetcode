package algorithms.Search;

public class BinarySearch {

	public static int binarySearch(int[] nums, int key) {

		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int mid;

		while (low <= high) {

			mid = (high + low) / 2;

			if (key == nums[mid]) {
				return mid;
			} else if (key < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return -1;

	}

	public static int binarySearchRecursive(int[] nums, int key, int high,
			int low) {

		if (low <= high) {

			int mid = (high + low) / 2;

			if (key == nums[mid]) {
				return mid;
			} else if (key < nums[mid]) {
				return binarySearchRecursive(nums, key, mid - 1, low);
			} else {
				return binarySearchRecursive(nums, key, high, mid + 1);
			}
		} else {

			return -1;

		}
	}

	public static void main(String[] args) {

		int nums[] = { 1 };

		//System.out.println(binarySearch(nums, 9));
		System.out.println(binarySearchRecursive(nums, 8, 0, 0));

	}

}
