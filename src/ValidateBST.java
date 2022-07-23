import java.util.ArrayList;

public class ValidateBST {
    class Node{
        int val;
        Node left;
        Node right;
        Node(int val, Node left, Node right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    static void inoder(Node node, ArrayList<Integer> ans){
        if(node == null) return;
        inoder(node.left,ans);
        ans.add(node.val);
        inoder(node.right,ans);
    }


    public static void main(String[] args) {

    }
}
