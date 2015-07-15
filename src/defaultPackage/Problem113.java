package defaultPackage;

import java.util.ArrayList;
import java.util.List;

import test.TreeNode;

public class Problem113 {

	public List<List<Integer>> listsOfList = new ArrayList<List<Integer>>();

	public List<List<Integer>> pathSum(TreeNode root, int sum) {

		List<Integer> list = new ArrayList<Integer>();

		traverse(root, list, sum);

		return listsOfList;

	}

	public void traverse(TreeNode root, List<Integer> list, int sum) {

		if (root != null) {

			List<Integer> listLocal = new ArrayList<Integer>();

			for (int i : list) {
				listLocal.add(i);
			}

			listLocal.add(root.val);

			if (root.left == null && root.right == null) {
				int sumLocal = 0;
				for (int j : listLocal) {
					sumLocal += j;
				}

				if (sumLocal == sum) {
					listsOfList.add(listLocal);
				}
			} else {
				traverse(root.left, listLocal, sum);
				traverse(root.right, listLocal, sum);
			}

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
