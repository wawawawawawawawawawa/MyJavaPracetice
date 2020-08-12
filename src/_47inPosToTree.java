import java.util.HashMap;

public class _47inPosToTree {
//    根据中序和后序数组重建二叉树
    public Node inPosToTree(int[]in,int[]pos){
        if (in == null||pos == null){
            return null;
        }
        HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
        return inPos(in,0,in.length-1,pos,0,pos.length-1,map);
    }

    public Node inPos(int[] n,int ni,int nj,int[]s,int si,int sj,HashMap<Integer,Integer>map){
        if (si>sj){
            return null;
        }
        Node head = new Node(s[sj]);
        int index = map.get(s[sj]);
        head.left = inPos(n,ni,index-1,s,si,si+index-ni-1,map);
        head.right = inPos(n,index+1,nj,s,si+index-ni,sj-1,map);
        return head;
    }
}
