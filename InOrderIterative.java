// Given a binary tree. Find the inorder traversal of the tree without using recursion.

import java.util.*;

public class InOrderIterative {
    ArrayList<Integer> inOrder(Node root)
    {
        Node current = root;
        ArrayList<Integer> res = new ArrayList<>();
        Stack<Node> s = new Stack<Node>();
        while(true){
            if(current != null){
                s.push(current);
                current = current.left;
            } else if(!s.isEmpty()){
                current = s.pop();
                res.add(current.data);
                current = current.right;
            } else {
                break;
            }
        }
        return res;
    }
}
