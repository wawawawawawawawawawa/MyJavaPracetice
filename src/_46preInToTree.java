import java.util.HashMap;

public class _46preInToTree {
//    根据前序和中序数组构建二叉树
    public Node preInToTree(int[]pre,int[] in){
        if (pre == null || in ==null){
            return null;
        }
        HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
        return preIn(pre,0,pre.length-1,in,0,in.length-1,map);
    }

    public Node preIn(int[]pre,int pi,int pj,int[]n,int ni,int nj,HashMap<Integer,Integer>map){
        if (pi>pj){
            return null;
        }
        Node head = new Node(pre[pi]);
        int index = map.get(pre[pi]);
        head.left = preIn(pre,pi+1,pi+index-ni,n,ni,index-1,map);
        head.right = preIn(pre,pi+index-ni+1,pj,n,index+1,nj,map);
        return head;
    }
}
