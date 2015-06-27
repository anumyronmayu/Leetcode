package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem144 {

	public static List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> list = new ArrayList<Integer>();

		addE(root, list);

		return list;

	}

	public static void addE(TreeNode root, List<Integer> list) {

		if (root != null) {
			list.add(root.val);

			addE(root.left, list);

			addE(root.right, list);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
