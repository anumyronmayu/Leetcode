package defaultPackage;

import test.TreeLinkNode;

public class Problem116 {

	public void connect(TreeLinkNode root) {

		if (root != null) {

			root.next = null;

			if (root.left != null) {

				root.left.next = root.right;
				root.right.next = null;

				traverse(root);
			}
		}
	}

	public void traverse(TreeLinkNode root) {

		if (root.left.left != null) {

			root.left.left.next = root.left.right;
			root.right.left.next = root.right.right;
			root.left.right.next = root.right.left;

			if (root.right.next == null) {
				root.right.right.next = null;
			} else {
				root.right.right.next = root.right.next.left;
			}

			traverse(root.left);
			traverse(root.right);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
