package defaultPackage;

import test.TreeNode;

public class Problem129 {

	public int sum = 0;

	public int sumNumbers(TreeNode root) {

		if (root == null) {
			return 0;
		}

		String s = "";

		traverse(root, s);

		return sum;

	}

	public void traverse(TreeNode root, String s) {
		if (root != null) {

			StringBuffer sb = new StringBuffer(s);
			sb = sb.append(String.valueOf(root.val));

			if (root.left == null && root.right == null) {

				sum += Integer.parseInt(sb.toString());

			} else {
				traverse(root.left, sb.toString());
				traverse(root.right, sb.toString());
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
