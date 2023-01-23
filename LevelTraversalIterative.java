import java.util.Scanner;

public class LevelTraversalIterative extends CreateTree{

    public static int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void printCurrentLevel(TreeNode root,int level){
        if(root==null) return;
        if(level==1){
            System.out.print(root.data+" ");
        }
        else if(level>1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        TreeNode root=createTree(sc);
        for(int i=1;i<=height(root);i++){
            printCurrentLevel(root, i);
        }
    }
}
