package defaultPackage;

public class Problem34 {

	public int[] searchRange(int[] nums, int target) {

		int index = binarySearch(nums, target);

		int[] b = { -1, -1 };

		if (index == -1) {
			return b;
		}

		int back = index;
		int front = index;

		while (back < nums.length && nums[back] == target) {
			back++;
		}

		while (front >= 0 && nums[front] == target) {
			front--;
		}

		back--;
		front++;

		int[] a = { front, back };

		return a;
	}

	public int binarySearch(int[] nums, int target) {

		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int mid;

		while (low <= high) {

			mid = (low + high) / 2;

			if (nums[mid] == target) {
				return mid;
			} else if (target < nums[mid]) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
