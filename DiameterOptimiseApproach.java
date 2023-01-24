public class DiameterOptimiseApproach extends CreateTreeUsingPreOrder {
    static class TreeInfo {
        int ht;
        int dia;

        TreeInfo(int ht, int dia) {
            this.ht = ht;
            this.dia = dia;
        }
    }
    public static TreeInfo diameter(Node root){
        if(root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo leftSub=diameter(root.left);
        TreeInfo rightSub=diameter(root.right);
        int myHeight = Math.max(leftSub.ht, rightSub.ht) + 1;

        int dia1= leftSub.ht+rightSub.ht+1;
        int dia2=leftSub.dia;
        int dia3= rightSub.dia;

        int myDiam=Math.max(dia1,Math.max(dia2,dia3));
        return new TreeInfo(myHeight,myDiam);
    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(nodes);
        System.out.println(diameter(root).dia);
    }
}
