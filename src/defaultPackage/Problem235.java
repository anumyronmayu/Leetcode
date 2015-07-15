package defaultPackage;

import test.TreeNode;

public class Problem235 {

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		int small = Math.min(p.val, q.val);
		int large = Math.max(p.val, q.val);

		return traverse(root, small, large);

	}

	public TreeNode traverse(TreeNode root, int small, int large) {

		if (root.val >= small && root.val <= large) {
			return root;
		} else if (root.val < small) {
			return traverse(root.right, small, large);
		} else {
			return traverse(root.left, small, large);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
