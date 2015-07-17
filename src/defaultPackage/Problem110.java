package defaultPackage;

public class Problem110 {

	public boolean isBalanced;

	public boolean isBalanced(TreeNode root) {

		if (root == null) {
			return true;
		}

		isBalanced = true;

		traversal(root);

		return isBalanced;

	}

	public int traversal(TreeNode root) {

		if (root.left == null && root.right == null) {
			return 1;
		} else if (root.left != null && root.right == null) {
			int height = traversal(root.left);
			if (height > 1) {
				isBalanced = false;
			}
			return height + 1;
		} else if (root.left == null && root.right != null) {
			int height = traversal(root.right);
			if (height > 1) {
				isBalanced = false;
			}
			return height + 1;
		} else {
			int heightL = traversal(root.left);
			int heightR = traversal(root.right);
			if (Math.abs(heightL - heightR) > 1) {
				isBalanced = false;
			}
			return Math.max(heightL, heightR) + 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
