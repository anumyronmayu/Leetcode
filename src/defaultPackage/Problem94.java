package defaultPackage;

import test.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class Problem94 {

	public static List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		addE(root, list);

		return list;

	}

	public static void addE(TreeNode root, List<Integer> list) {

		if (root != null) {
			addE(root.left, list);
			list.add(root.val);
			addE(root.right, list);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
