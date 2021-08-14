/**
 * Given two binary trees with head reference as T and S having at most N 
 * nodes. The task is to check if S is present as subtree in T.
 * 
    A subtree of a tree T1 is a tree T2 consisting of a node in T1 and all of its descendants in T1.
 */

public class IfSubtree {
    boolean areIdentical(Node root1, Node root2)
    {
        if(root1 == null){
            return root1 == root2;
        }
        
        if(root1 != null && root2 != null){
            return (root1.data == root2.data) && areIdentical(root1.left, root2.left) && areIdentical(root1.right, root2.right);
        }
        
        return false;
    }
    
     boolean isSubtree(Node T, Node S)
    {
        /* base cases */
        if (S == null)
            return true;
  
        if (T == null)
            return false;
  
        /* Check the tree with root as current node */
        if (areIdentical(T, S))
            return true;
  
        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        return isSubtree(T.left, S)
                || isSubtree(T.right, S);
    }
  
}
