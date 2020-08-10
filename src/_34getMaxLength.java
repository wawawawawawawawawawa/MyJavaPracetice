import java.util.HashMap;

public class _34getMaxLength {
//    在二叉树中找到累加和为指定值的最长路径长度
    public int getMaxLength(Node head,int k){
        HashMap<Integer,Integer>hashMap = new HashMap<Integer, Integer>();
        hashMap.put(0,0);
        return  preOrder(head,k,0,1,0,hashMap);
    }

    public int preOrder(Node head,int k,int preSum,int level,int maxLen,HashMap<Integer,Integer>hashMap){
        if (head == null){
            return maxLen;
        }
        int curSum = preSum + head.value;
        if (!hashMap.containsKey(curSum)){
            hashMap.put(curSum,level);
        }
        if (hashMap.containsKey(curSum-k)){
            maxLen = Math.max(level-hashMap.get(curSum-k),maxLen);
        }
        maxLen = preOrder(head.left,k,curSum,level+1,maxLen,hashMap);
        maxLen = preOrder(head.right,k,curSum,level+1,maxLen,hashMap);

        //这里是核心的回退机制，因为要返回上一层去执行，所以需要从hashmap中去掉这一层的信息
        if (hashMap.get(curSum) == level){
            hashMap.remove(curSum);
        }
        return maxLen;
    }
}
