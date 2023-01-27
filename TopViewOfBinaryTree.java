import java.util.*;

public class TopViewOfBinaryTree extends CreateTreeUsingPreOrder {
    static class Pair{
        int hd;
        Node node;

        Pair(int hd,Node node){
            this.hd=hd;
            this.node=node;
        }
    }
    static ArrayList<Integer> topView(Node root){
        Queue<Pair> q=new ArrayDeque<>();
        Map<Integer,Integer> map=new TreeMap<>();
        q.add(new Pair(0,root));
        while (!q.isEmpty()){
            Pair curr=q.poll();
            if(!map.containsKey(curr.hd)){
                map.put(curr.hd,curr.node.data);
            }
            if(curr.node.left!=null){
                q.add(new Pair(curr.hd-1,curr.node.left));
            }
            if(curr.node.right!=null){
                q.add(new Pair(curr.hd+1,curr.node.right));
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
        Node root=createTree(nodes);
        System.out.println(topView(root));
    }
}
