package defaultPackage;

public class Problem74 {

	public static boolean searchMatrix(int[][] matrix, int target) {

		int nums[] = new int[matrix.length];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = matrix[i][0];
		}

		int row = binarySearchRow(nums, target, 0, nums.length - 1);

		// System.out.println("Row: " + row);

		if (row < 0) {
			return false;
		}

		int index = binarySearch2(matrix[row], target, 0,
				matrix[row].length - 1);

		// System.out.println("Index: " + index);
		// System.out.println("Index2: " + index2);

		if (index == -1) {
			return false;
		} else {
			return true;
		}

	}

	public static int binarySearchRow(int[] nums, int key, int low, int high) {

		if (low <= high) {

			int mid = (low + high) / 2;

			if (nums[mid] == key) {
				return mid;
			} else if (nums[mid] < key) {
				return binarySearchRow(nums, key, mid + 1, high);
			} else {
				return binarySearchRow(nums, key, low, mid - 1);
			}
		} else {
			return low - 1;
		}

	}

	public static int binarySearch2(int[] nums, int key, int low, int high) {

		if (low <= high) {

			int mid = (high + low) / 2;

			if (key == nums[mid]) {
				return mid;
			} else if (key < nums[mid]) {
				return binarySearch2(nums, key, low, mid - 1);
			} else {
				return binarySearch2(nums, key, mid + 1, high);
			}
		} else {
			return -1;
		}

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
		int[][] matrix = { { 1 } };

		System.out.println(searchMatrix(matrix, 1));

	}

}
