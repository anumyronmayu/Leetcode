package defaultPackage;

import test.TreeNode;

public class Problem101 {

	public boolean isSymmetric(TreeNode root) {

		if (root == null) {
			return true;
		} else if (root.left == null && root.right != null) {
			return false;
		} else if (root.left != null && root.right == null) {
			return false;
		} else {
			root.left = invertTree(root.left);

			return isSameTree(root.left, root.right);
		}
	}

	public TreeNode invertTree(TreeNode root) {

		if (root != null) {

			TreeNode temp;

			temp = root.left;
			root.left = root.right;
			root.right = temp;

			invertTree(root.left);
			invertTree(root.right);

		}

		return root;

	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		boolean same = true;

		same = traverse(p, q, same);

		return same;

	}

	public boolean traverse(TreeNode p, TreeNode q, boolean same) {

		if (p == null && q != null || p != null && q == null) {
			same = false;
		}

		if (p != null && q != null) {

			if (p.val != q.val) {
				same = false;
			}

			same = traverse(p.left, q.left, same);
			same = traverse(p.right, q.right, same);
		}

		return same;

	}

	public static void main(String[] args) {

	}

}
