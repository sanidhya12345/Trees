import java.util.Scanner;

public class InorderTraversalBT extends CreateTree{
    public static void inOrderTraversal(TreeNode node){
        if(node==null){
            return ;
        }
        inOrderTraversal(node.left);
        System.out.print(node.data+" ");
        inOrderTraversal(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        inOrderTraversal(root);
    }
}
