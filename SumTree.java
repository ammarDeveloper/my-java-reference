/**
 * Given a Binary Tree. Return 1 if, for every node X in the tree other 
 * than the leaves, its value is equal to the sum of its left subtree's 
 * value and its right subtree's value. Else return 0.

    An empty tree is also a Sum Tree as the sum of an empty tree can be 
    considered to be 0. A leaf node is also considered a Sum Tree.
    
 */

public class SumTree {
    boolean isSumTree(Node root)
	{
	    if(root == null){
	        return true;
	    }
	    
	    if(root.left == null && root.right == null){
	        return true;
	    }
	    
	    int lsum = sum(root.left);
	    int rsum = sum(root.right);
	    
	    return (root.data == lsum + rsum) && isSumTree(root.left) && isSumTree(root.right);
	}
	
	int sum(Node node){
	    if(node == null){
	        return 0;
	    }
	    
	    return node.data + sum(node.left) + sum(node.right);
	}
}
