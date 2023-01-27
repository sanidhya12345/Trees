import java.util.*;

public class BottomViewOfBinaryTree extends CreateTreeUsingPreOrder{
    static class Pair{
        int hd;
        CreateTreeUsingPreOrder.Node node;

        Pair(int hd, CreateTreeUsingPreOrder.Node node){
            this.hd=hd;
            this.node=node;
        }
    }
    static ArrayList<Integer> bottomView(CreateTreeUsingPreOrder.Node root){
        Queue<TopViewOfBinaryTree.Pair> q=new ArrayDeque<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new TopViewOfBinaryTree.Pair(0,root));
        while (!q.isEmpty()){
            TopViewOfBinaryTree.Pair curr=q.poll();
            map.put(curr.hd,curr.node.data);
            if(curr.node.left!=null){
                q.add(new TopViewOfBinaryTree.Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new TopViewOfBinaryTree.Pair(curr.hd+1,curr.node.right));
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
    public static void main(String[] args) {
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        CreateTreeUsingPreOrder.Node root=createTree(nodes);
        System.out.println(bottomView(root));
    }
}
