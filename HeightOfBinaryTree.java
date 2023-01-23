import java.util.Scanner;

public class HeightOfBinaryTree extends CreateTree{

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        System.out.println(height(root));
    }
}
