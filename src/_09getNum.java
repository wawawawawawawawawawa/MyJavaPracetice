import java.util.LinkedList;

public class _09getNum {
//    获取子数组最大值和最小值的差小于等于num的子数组数量
    public int getNumOfKid(int[]arr,int num){
        if(arr == null|| arr.length==0){
            return 0;
        }
        LinkedList<Integer>qmax = new LinkedList<Integer>();
        LinkedList<Integer>qmin = new LinkedList<Integer>();
        int i = 0;
        int j = 0;
        int res = 0;
        while (i<arr.length){
            while (j<arr.length) {
                while (!qmax.isEmpty() && arr[j] >= arr[qmax.peekLast()]) {
                    qmax.pollLast();
                }
                qmax.addLast(j);

                while (!qmin.isEmpty() && arr[j] <= arr[qmin.pollLast()]){
                    qmin.pollLast();
                }
                qmin.addLast(j);
                if(arr[qmax.peekFirst()]-arr[qmin.peekFirst()]>num){
                    break;
                }
                j++;
            }
            if(qmax.peekFirst()==i){
                qmax.pollFirst();
            }
            if(qmin.peekFirst()==i){
                qmin.pollFirst();
            }
            res += j-i;
        }
        return res;
    }
}
