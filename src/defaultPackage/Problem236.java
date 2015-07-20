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

		int index = Math.min(pList.size(), qList.size()) - 1;
		for (int i = 0; i < Math.min(pList.size(), qList.size()); i++) {
			if (pList.get(i) != qList.get(i)) {
				index = i;
				break;
			}
		}

		return pList.get(index);
	}

	public void traverse(TreeNode root, List<TreeNode> list) {

		List<TreeNode> listLocal = new ArrayList<TreeNode>();

		for (TreeNode tn : list) {
			listLocal.add(tn);
		}

		listLocal.add(root);

		if (root == p) {
			pList = listLocal;
		}

		if (root == q) {
			qList = listLocal;
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
		
		tn1.left = tn2;
		tn1.right = tn3;
		
		System.out.println((new Problem236()).lowestCommonAncestor(tn1, tn2, tn3).val);

	}

}
