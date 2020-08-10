public class _35biggestSubBST {
//    找到二叉树中的最大搜索二叉树
    public Node biggestSubBST(Node head){
        int[]record = new int[3];
        return posOrder(head,record);
    }

    public Node posOrder(Node head,int[]record){
        if (head == null){
            record[0] = 0;
            record[1] = Integer.MAX_VALUE;
            record[2] = Integer.MAX_VALUE;
            return null;
        }
        int value = head.value;
        Node left = head.left;
        Node right = head.right;
        Node lBST = posOrder(left,record);
        int lSize = record[0];
        int lMin = record[1];
        int lMax = record[2];
        Node rBST = posOrder(right,record);
        int rSize = record[0];
        int rMin = record[1];
        int rMax = record[2];
        if (left == lBST && right == rBST && value>lMax && value < rMin){
            record[0] = rSize + lSize +1;
            return head;
        }
        record[0] =Math.max(rSize,lSize);
        return rSize>lSize?rBST:lBST;
    }
}
