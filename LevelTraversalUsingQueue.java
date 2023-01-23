import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LevelTraversalUsingQueue extends CreateTree {
    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode curr=queue.poll();
            System.out.print(curr.data+" ");
            if(curr.left!=null){
                queue.add(curr.left);
            }
            if(curr.right!=null){
                queue.add(curr.right);
            }
        }
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       TreeNode root=createTree(sc);
       levelOrderTraversal(root);
    }
}
