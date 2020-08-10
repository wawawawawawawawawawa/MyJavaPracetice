import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class _38zigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(Node head){
        List<List<Integer>>result = new ArrayList<List<Integer>>();
        int level = 0;
        dfs(head,result,level);
        return result;
    }

    public void dfs(Node head,List<List<Integer>>result,int level){
        if (head == null){
            return;
        }
        if (result.size()<=level){
            List<Integer>newList = new LinkedList<Integer>();
            result.add(newList);
        }
        List<Integer>curList = result.get(level);
        if ((level&1)==0){
            curList.add(0, head.value);
        }else {
            curList.add(head.value);
        }
        dfs(head.left,result,level+1);
        dfs(head.right,result,level+1);
    }
}
