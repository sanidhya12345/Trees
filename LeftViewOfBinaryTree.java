public class LeftViewOfBinaryTree extends CreateTreeUsingPreOrder{
    static int max_level = 0;
    static void leftViewUtil(Node node, int level)
    {
        if (node == null)
            return;
        if (max_level < level) {
            System.out.print(node.data + " ");
            max_level = level;
        }
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);
    }
    static void printLeftView(Node root){
        leftViewUtil(root,1);
    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(nodes);
        printLeftView(root);
    }
}
