package dataStructures.Tree;

public class CalculateTreeHeight {

	public static int calculateTreeHeight(Node root) {

		if (root == null) {
			return 0;
		} else {
			return Math.max(calculateTreeHeight(root.left),
					calculateTreeHeight(root.right)) + 1;
		}

	}

	public static void main(String[] args) {
		
		Node tn1 = new Node(1);
		Node tn2 = new Node(1);
		Node tn3 = new Node(1);
		tn1.left = tn2;
		tn2.right = tn3;
		
		System.out.println(calculateTreeHeight(tn1));

	}

}
