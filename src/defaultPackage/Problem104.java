package defaultPackage;

public class Problem104 {

    public int max = 0;
    
    public int maxDepth(TreeNode root) {
        
        
        if(root == null) return 0;
        
        traverse(root, 0);
         
       
        
        return max;
        
    }
    
    public void traverse(TreeNode node, int depth){
        
        depth++;
        
        if(depth > max){
            max = depth;
        }
        
        if(node.left != null){
           traverse(node.left, depth); 
        }
        
        if(node.right != null){
            traverse(node.right, depth);
        }
        
    }

	public static void main(String[] args) {
		
		TreeNode tn = new TreeNode(0);
		System.out.println(new Problem104().maxDepth(null));
		

	}

}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}
