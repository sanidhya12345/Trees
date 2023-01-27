public class RightViewOfBinaryTree extends CreateTreeUsingPreOrder{
    static int max_level = 0;
    static void rightViewUtil(Node node, int level)
    {
        if (node == null)
            return;
        if (max_level < level) {
            System.out.print(node.data + " ");
            max_level = level;
        }
        rightViewUtil(node.right, level + 1);
        rightViewUtil(node.left, level + 1);
    }

    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(nodes);
        rightViewUtil(root,1);
    }
}
