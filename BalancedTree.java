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

public class BalancedTree {
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    {
	    if(root == null){
	        return true;
	    }
	    
	    int lh;
	    int rh;
	    
	    lh = height(root.left);
	    rh = height(root.right);
	    
	    if(Math.abs(lh - rh) <= 1 && isBalanced(root.left) && isBalanced(root.right)){
	        return true;
	    }
	    
	    return false;
    }
    
    int height(Node node){
        if(node == null){
            return 0;
        }
        
        return  1 + Math.max(height(node.left), height(node.right));
    }
}
