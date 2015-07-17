package defaultPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem199 {

	public HashMap<Integer, List<Integer>> map;
	public int maxHeight;
	public List<List<Integer>> results;
	public List<Integer> l;

	public List<Integer> rightSideView(TreeNode root) {

		l = new ArrayList<Integer>();
		results = new ArrayList<List<Integer>>();
		results = levelOrder(root);

		for (List<Integer> list : results) {
			l.add(list.get(0));
		}

		return l;

	}

	public List<List<Integer>> levelOrder(TreeNode root) {

		if (root == null) {
			return results;
		}

		map = new HashMap<Integer, List<Integer>>();
		maxHeight = 0;

		traversal(root, 0);

		for (int i = 1; i <= maxHeight; i++) {
			results.add(map.get(i));
		}

		return results;

	}

	public void traversal(TreeNode root, int parentHeight) {

		if (root != null) {

			int height = parentHeight + 1;

			if (height > maxHeight) {
				maxHeight = height;
			}

			if (map.get(height) == null) {
				List<Integer> list = new ArrayList<Integer>();
				list.add(root.val);
				map.put(height, list);
			} else {
				map.get(height).add(root.val);
			}

			traversal(root.right, height);
			traversal(root.left, height);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
