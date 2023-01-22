import java.util.Scanner;

public class CountnNumberOfLeafNodes extends CreateTree {
    static int count=0;
    public static void countNumberOfLeafNodes(TreeNode node){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            count++;
        }
        countNumberOfLeafNodes(node.left);
        countNumberOfLeafNodes(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        countNumberOfLeafNodes(root);
        System.out.println(count);
    }
}
