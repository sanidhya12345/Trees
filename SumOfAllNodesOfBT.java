import java.util.Scanner;

public class SumOfAllNodesOfBT extends CreateTree {
    static int sum=0;
    public static void sumBT(TreeNode node){
        if(node==null) return;
        sum+=node.data;
        sumBT(node.left);
        sumBT(node.right);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        sumBT(root);
        System.out.println(sum);
    }
}
