package defaultPackage;

import test.TreeNode;

public class Problem111 {

	public int minDepth(TreeNode root) {

		if (root != null) {

			if (root.left == null && root.right == null) {
				return 1;
			} else if (root.left != null && root.right == null) {
				return minDepth(root.left) + 1;
			} else if (root.left == null && root.right != null) {
				return minDepth(root.right) + 1;
			} else {
				return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
			}

		} else {
			return 0;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
