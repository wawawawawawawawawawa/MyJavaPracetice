public class _45maxDistance {
//    二叉树节点间的最大距离
//    这里需要注意的是最远的距离不一定过root
//    record用于接收距离当前节点最远的距离
    public int maxDistance(Node head){
        int[] record = new int[1];
        return posOrder(head,record);
    }

    public int posOrder(Node head,int[]record){
        if (head == null){
            record[0] = 0;
            return 0;
        }
        int lMax = posOrder(head.left,record);
        int lMaxFromLeft = record[0];
        int rMax = posOrder(head.right,record);
        int rMaxFromRight = record[0];
        int curMaxNode = lMaxFromLeft + rMaxFromRight +1;
        record[0] = Math.max(lMaxFromLeft,rMaxFromRight) + 1;
        return Math.max(Math.max(lMax,rMax),curMaxNode);
    }
}
