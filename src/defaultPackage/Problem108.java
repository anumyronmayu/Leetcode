package defaultPackage;

public class Problem108 {

	public TreeNode sortedArrayToBST(int[] nums) {

		return traverse(nums, 0, nums.length - 1);

	}

	public TreeNode traverse(int[] nums, int low, int high) {

		if (low > high) {
			return null;
		}

		int mid = (low + high) / 2;

		TreeNode tn = new TreeNode(nums[mid]);
		tn.left = traverse(nums, low, mid - 1);
		tn.right = traverse(nums, mid + 1, high);

		return tn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
