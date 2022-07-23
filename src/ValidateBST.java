import java.util.ArrayList;

public class ValidateBST {
    //tree node
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
    //inorder, so that every element sits in ascending order
    static void inoder(Node node, ArrayList<Integer> ans){
        if(node == null) return;
        inoder(node.left,ans);
        ans.add(node.val);
        inoder(node.right,ans);
    }
    // validate it by checking the next element with previous, if previous is smaller than return false
    static boolean validateBST(Node root){
        ArrayList<Integer> ans = new ArrayList<>();
        inoder(root, ans);
        //starting the index from 1, because it needs to be compared with previous (0 here)
        // if i take 0 index then i need to compare it with -1, which contains no element.
        for(int i= 1; i<ans.size(); i++){
            if(ans.get(i)<= ans.get(i-1)){
                return false;
            }
        }return true;
    }


    public static void main(String[] args) {

    }
}
