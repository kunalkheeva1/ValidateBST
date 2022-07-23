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
    static boolean validateBST(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        inoder(root, ans);
        for(int i= 1; i<ans.size(); i++){
            if(ans.get(i)<= ans.get(i-1)){
                return false;
            }
        }return true;
    }


    public static void main(String[] args) {

    }
}
