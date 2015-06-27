package defaultPackage;

public class Problem100 {

	public static boolean isSameTree(TreeNode p, TreeNode q) {

		boolean same = true;

		same = traverse(p, q, same);

		return same;

	}

	public static boolean traverse(TreeNode p, TreeNode q, boolean same) {

		if (p == null && q != null || p != null && q == null) {
			same = false;
		}

		if (p != null && q != null) {

			if (p.val != q.val) {
				same = false;
			}

			same = traverse(p.left, q.left, same);
			same = traverse(p.right, q.right, same);
		}

		return same;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
