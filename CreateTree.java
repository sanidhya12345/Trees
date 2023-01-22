import java.util.Scanner;

public class CreateTree {
    public static TreeNode createTree(Scanner sc){
        TreeNode root=null;
        System.out.println("Enter data:-");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new TreeNode(data);
        System.out.println("Enter left for:- "+data);
        root.left=createTree(sc);
        System.out.println("Enter right for:- "+data);
        root.right=createTree(sc);
        return root;
    }
    public static void preOrder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        preOrder(root);
    }
}
