import java.util.Scanner;

public class MinimumDepthOfBT extends CreateTree {
    
    public static int minDepth(TreeNode node){
        if(node==null) return 0;
        if(node.left==null){
            return minDepth(node.left)+1;
        }
        if(node.right==null){
            return minDepth(node.right)+1;
        }
        return Math.min(minDepth(node.left),minDepth(node.right))+1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        System.out.println(minDepth(root));
    }
}
