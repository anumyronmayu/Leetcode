package defaultPackage;

import test.TreeNode;

public class Problem112 {

	public boolean hasPathSum = false;

	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null) {
			return false;
		} else {
			traverse(root, 0, sum);
			return hasPathSum;
		}
	}

	public void traverse(TreeNode root, int i, int sum) {

		if (root != null) {

			i = i + root.val;

			if (root.left == null && root.right == null) {
				if (i == sum) {
					hasPathSum = true;
				}
			} else {
				traverse(root.left, i, sum);
				traverse(root.right, i, sum);
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
