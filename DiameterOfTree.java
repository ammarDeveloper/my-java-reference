class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
}

public class DiameterOfTree {
    // Function to return the diameter of a Binary Tree.
    int diameter(Node root) {
        if(root == null){
            return 0;
        }
        int lh;
        int rh;
        
        lh = height(root.left);
        rh = height(root.right);
        
        int ld;
        int rd;
        
        ld = diameter(root.left);
        rd = diameter(root.right);
        
        return Math.max(lh+rh+1, Math.max(ld, rd));
    }
    
    int height(Node node){
        if(node == null){
            return 0;
        }
        
        return 1 + Math.max(height(node.left), height(node.right));
    }
}
