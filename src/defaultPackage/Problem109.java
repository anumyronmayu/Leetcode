package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem109 {

	public TreeNode sortedListToBST(ListNode head) {

		if (head == null) {
			return null;
		}

		List<Integer> list = new ArrayList<Integer>();

		while (head != null) {
			list.add(head.val);
			head = head.next;
		}

		int[] nums = new int[list.size()];

		for (int i = 0; i < nums.length; i++) {

			nums[i] = list.get(i);

		}

		return arrayToBST(nums);

	}

	public TreeNode arrayToBST(int[] nums) {

		return traverse(nums, 0, nums.length - 1);

	}

	public TreeNode traverse(int[] nums, int low, int high) {

		int mid = (low + high) / 2;

		if (low <= high) {

			TreeNode tn = new TreeNode(nums[mid]);

			tn.left = traverse(nums, low, mid - 1);
			tn.right = traverse(nums, mid + 1, high);

			return tn;

		} else {
			return null;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
