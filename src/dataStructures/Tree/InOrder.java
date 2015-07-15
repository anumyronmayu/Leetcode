package dataStructures.Tree;

public class InOrder {

	void InOrder(Node root) {

		if (root != null) {
			InOrder(root.left);
			System.out.print(root.data + " ");
			InOrder(root.right);
		}

	}

}
