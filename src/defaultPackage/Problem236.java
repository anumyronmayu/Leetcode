package defaultPackage;

import java.util.ArrayList;
import java.util.List;

public class Problem236 {

	public List<TreeNode> pList;
	public List<TreeNode> qList;
	public TreeNode p;
	public TreeNode q;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

		if (root == null || p == null || q == null) {
			return null;
		}

		this.p = p;
		this.q = q;

		List<TreeNode> list = new ArrayList<TreeNode>();
		traverse(root, list);

		/*
		 * int index = Math.min(pList.size(), qList.size()) - 1; for (int i = 0;
		 * i < Math.min(pList.size(), qList.size()); i++) { if (pList.get(i) !=
		 * qList.get(i)) { index = i; break; } }
		 * 
		 * return pList.get(index - 1);
		 */

		int minPQ = Math.min(pList.size(), qList.size());

		for (int i = 0; i < minPQ; i++) {
			if (pList.get(i) != qList.get(i)) {
				return pList.get(i - 1);
			}
		}

		return pList.get(minPQ - 1);
	}

	public void traverse(TreeNode root, List<TreeNode> list) {

		List<TreeNode> listLocal = new ArrayList<TreeNode>();

		for (TreeNode tn : list) {
			listLocal.add(tn);
		}

		listLocal.add(root);

		for (TreeNode tn : listLocal) {
			System.out.println("Root: " + root.val + " " + tn.val);
		}

		if (root == p) {
			pList = listLocal;
			System.out.println("P : Root: " + root.val);
		}

		if (root == q) {
			qList = listLocal;
			System.out.println("Q : Root: " + root.val);
		}

		if (root.left != null) {
			traverse(root.left, listLocal);
		}

		if (root.right != null) {
			traverse(root.right, listLocal);
		}
	}

	public static void main(String[] args) {

		TreeNode tn1 = new TreeNode(1);
		TreeNode tn2 = new TreeNode(2);
		TreeNode tn3 = new TreeNode(3);
		TreeNode tn4 = new TreeNode(4);
		TreeNode tn5 = new TreeNode(5);
		TreeNode tn6 = new TreeNode(6);
		TreeNode tn7 = new TreeNode(7);

		tn1.left = tn2;
		tn1.right = tn3;
		
		tn2.left = tn4;
		tn2.right = tn5;
		
		tn3.left = tn6;
		tn3.right = tn7;

		System.out.println((new Problem236()).lowestCommonAncestor(tn1, tn4,
				tn7).val);

	}

}
