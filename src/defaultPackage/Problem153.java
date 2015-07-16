package defaultPackage;

public class Problem153 {

	public int findMin(int[] nums) {

		int n = nums.length;
		int low = 0;
		int high = n - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (low == high) {
				return nums[mid];
			} else {
				if (nums[mid] > nums[low]) {
					low = mid;
				} else {
					high = mid;
				}
			}
		}

		return -1;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
