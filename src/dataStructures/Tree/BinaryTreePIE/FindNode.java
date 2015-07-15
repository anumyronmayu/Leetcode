package dataStructures.Tree.BinaryTreePIE;

public class FindNode {

	public Node findNode(Node root, int value) {
		while (root != null) {
			int currval = root.getValue();
			if (currval == value)
				break;
			if (currval < value) {
				root = root.getRight();
			} else {
				root = root.getRight();
			}
		}

		return root;
	}
}
