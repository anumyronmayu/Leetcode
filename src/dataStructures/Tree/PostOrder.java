package dataStructures.Tree;

public class PostOrder {

	void PostOrder(Node root) {

		if (root != null) {
			PostOrder(root.left);
			PostOrder(root.right);
			System.out.print(root.data + " ");
		}

	}

}
