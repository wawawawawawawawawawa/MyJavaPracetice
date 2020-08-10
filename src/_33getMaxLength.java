import java.util.HashMap;

public class _33getMaxLength {
//    未排序数组中累加和为给定值的最长子数组系列问题
    public int getMaxLength(int[] arr,int k){
        if(arr == null || arr.length ==0){
            return 0;
        }
        HashMap<Integer,Integer>map = new HashMap<Integer, Integer>();
        int sum = 0;
        int len = 0;
        map.put(0,-1);
        for (int i=0;i<arr.length;i++){
            sum += arr[i];
            if (map.containsKey(sum-k)){
                len = Math.max(i-map.get(sum-k),len);
            }
            if (!map.containsKey(sum)){
                map.put(sum,i);
            }
        }
        return len;
    }
}
