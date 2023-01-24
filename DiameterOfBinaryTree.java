//Aproach-1:- O(n^2)
public class DiameterOfBinaryTree extends CreateTreeUsingPreOrder {
    public static int diameter(Node root){
        if(root==null){
            return 0;
        }
        int dia1=height(root.left)+height(root.right)+1;
        int dia2=diameter(root.left);
        int dia3=diameter(root.right);
        return Math.max(dia1,Math.max(dia2,dia3));
    }
    public static int height(Node root){
        if(root==null){
            return 0;
        }
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(nodes);
        System.out.println(diameter(root));
    }
}
