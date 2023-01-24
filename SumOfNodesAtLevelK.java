import java.util.*;
public class SumOfNodesAtLevelK extends CreateTreeUsingPreOrder{
    static HashMap<Integer,Integer> map=new HashMap<>();
    public static void levelorder(Node root,int level){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode=q.remove();
            if(currNode==null){
                level++;
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(null);
                }
            }
            else{
                map.put(currNode.data,level);
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] nodes={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        Node root=createTree(nodes);
        levelorder(root,1);
        System.out.println("Enter the level:-");
        int level=sc.nextInt();
        int sum=0;
        for(Integer node:map.keySet()){
            if(map.get(node)==level){
                sum+=node;
            }
        }
        System.out.println("Sum of level "+level+" is "+sum);
    }
}
