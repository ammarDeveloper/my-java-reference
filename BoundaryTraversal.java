/**
 * Given a Binary Tree, find its Boundary Traversal. The traversal should 
 * be in the following order: 

    Left boundary nodes: defined as the path from the root to the 
    left-most node ie- the leaf node you could reach when you always 
    travel preferring the left subtree over the right subtree. 

    Leaf nodes: All the leaf nodes except for the ones that are part of 
    left or right boundary.

    Reverse right boundary nodes: defined as the path from the right-most 
    node to the root. The right-most node is the leaf node you could reach 
    when you always travel preferring the right subtree over the left 
    subtree. Exclude the root from this as it was already included in the 
    traversal of left boundary nodes.

    Note: If the root doesn't have a left subtree or right subtree, then 
    the root itself is the left or right boundary. 
    
 */


import java.util.*;

public class BoundaryTraversal {
    void printBoundaryLeft(Node node, ArrayList<Integer> res){
        if(node != null){
            if(node.left != null){
                res.add(node.data);
                printBoundaryLeft(node.left, res);
            } else if(node.right != null) {
                res.add(node.data);
                printBoundaryLeft(node.right, res);
            }
        }
    }
    
    void printBoundaryLeaves(Node node, ArrayList<Integer> res){
        if(node != null){
            printBoundaryLeaves(node.left, res);
            
            if(node.left == null && node.right == null){
                res.add(node.data);
            }
            
            printBoundaryLeaves(node.right, res);
        }
    }
    
    void printBoundaryRight(Node node, ArrayList<Integer> res){
        if(node != null){
            if(node.right != null){
                printBoundaryRight(node.right, res);
                res.add(node.data);
            } else if (node.left != null) {
                printBoundaryRight(node.left, res);
                res.add(node.data);
            }
        }
    }
    
	ArrayList <Integer> printBoundary(Node node)
	{
	    ArrayList<Integer> res = new ArrayList<>();
	    if(node != null){
	        res.add(node.data);
	        printBoundaryLeft(node.left, res);
	        printBoundaryLeaves(node.left,  res);
	        printBoundaryLeaves(node.right, res);
	        printBoundaryRight(node.right, res);
	        return res;
	    }
	    return res;
	}
}
