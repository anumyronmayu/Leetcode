package defaultPackage;

import test.TreeLinkNode;

public class Problem117 {

	public void connect(TreeLinkNode root) {

		if (root != null) {

			root.next = null;

			traverse(root);

		}
	}

	public void traverse(TreeLinkNode root) {

		if (root.left != null) {
			if (root.right != null) {
				root.left.next = root.right;
			} else {
				root.left.next = getNext(root);
			}
		}

		if (root.right != null) {
			root.right.next = getNext(root);
		}

		if (root.right != null) {
			traverse(root.right);
		}

		if (root.left != null) {
			traverse(root.left);
		}

	}

	public TreeLinkNode getNext(TreeLinkNode root) {

		while (root.next != null) {

			if (root.next.left != null) {
				return root.next.left;
			}

			if (root.next.right != null) {
				return root.next.right;
			}

			root = root.next;
		}

		return null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
