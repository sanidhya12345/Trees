import java.util.Scanner;

public class PostOrderTraversalBT extends CreateTree{
    public static void postOrder(TreeNode node){
        if(node==null){
            return ;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data+" ");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        postOrder(root);
    }
}
