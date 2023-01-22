import java.util.Scanner;

public class CreateTree {
    static Scanner sc=null;
    public static TreeNode createTree(){
        TreeNode root=null;
        System.out.println("Enter data:-");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new TreeNode(data);
        System.out.println("Enter left for:- "+data);
        root.left=createTree();
        System.out.println("Enter right for:- "+data);
        root.right=createTree();
        return root;
    }
    public static void preOrder(TreeNode node){
        if(node==null) return;
        System.out.print(node.data+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
    public static void main(String[] args) {
        sc=new Scanner(System.in);
        TreeNode root=createTree();
        preOrder(root);
    }
}
