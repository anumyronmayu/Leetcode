package defaultPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Problem103 {

	public HashMap<Integer, List<Integer>> map;
	public int maxHeight;

	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		List<List<Integer>> results = new ArrayList<List<Integer>>();

		if (root == null) {
			return results;
		}

		map = new HashMap<Integer, List<Integer>>();
		maxHeight = 0;

		traversal(root, 0);

		for (int i = 1; i <= maxHeight; i++) {

			if ((i % 2) == 1) {
				results.add(map.get(i));
			} else {
				List<Integer> list = map.get(i);
				Collections.reverse(list);
				results.add(list);
			}
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

			traversal(root.left, height);
			traversal(root.right, height);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
