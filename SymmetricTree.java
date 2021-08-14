

// class of the node of the tree is as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}


public class SymmetricTree {
    // return true/false denoting whether the tree is Symmetric or not
    public static boolean isSymmetric(Node root)
    {
        if(root == null){
            return true;
        }
        
        return isSymmetric(root.left, root.right);
    }
    
    public static boolean isSymmetric(Node left, Node right){
        if(left == null || right == null){
            return left == right;
        }
        
        if(left.data != right.data){
            return false;
        }
        
        return isSymmetric(left.left, right.right) && isSymmetric(left.right, right.left);
    }
}
