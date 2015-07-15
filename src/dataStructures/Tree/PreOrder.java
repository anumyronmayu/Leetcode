package dataStructures.Tree;

public class PreOrder {

	void Preorder(Node root) {

		if (root != null) {
			System.out.print(root.data + " ");
			Preorder(root.left);
			Preorder(root.right);
		}

	}

}
