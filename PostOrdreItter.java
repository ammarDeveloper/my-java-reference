import java.util.*;

/**
 * Given a binary tree. Find the postorder traversal of the tree without 
 * using recursion.
 */

public class PostOrdreItter {
    ArrayList<Integer> postOrder(Node node) {
        ArrayList<Integer> res = new ArrayList<>();
        HashSet<Node> hs = new HashSet<>();
        if(node == null){
            return res;
        }
        
        Node temp = node;

        
        while(temp != null && !hs.contains(temp)){
            if(temp.left != null && !hs.contains(temp.left)){
                temp = temp.left;
            } else if(temp.right != null && !hs.contains(temp.right)){
                temp = temp.right;
            } else {
                res.add(temp.data);
                hs.add(temp);
                temp = node;
            }
        }
        return res;
        
    }
}
