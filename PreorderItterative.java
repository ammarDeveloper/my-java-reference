import java.util.*;
/**Given a binary tree. Find the preorder traversal of the tree without 
 * using recursion. 
 * */

public class PreorderItterative {
    ArrayList<Integer> preOrder(Node root)
    {
        
        Node current = root;
        ArrayList<Integer> res = new ArrayList<>();
        if(current == null){
            return res;
        }
        Stack<Node> s = new Stack<Node>();
        
        s.push(current);
        
        while(s.size() > 0){
            Node node = s.pop();
            res.add(node.data);
            
            if(node.right != null){
                s.push(node.right);
            } 
            
            if(node.left != null){
                s.push(node.left);
            }
        }
        
        return res;
    }
}
