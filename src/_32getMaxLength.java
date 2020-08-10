public class _32getMaxLength {
//    未排序正数数组中累加和为给定值的最长子数组长度未排序正数数组中累加和为给定值的最长子数组长度
    public static int getMaxLength(int[]arr,int k){
        if(arr == null || arr.length ==0 || k<+0){
            return 0;
        }
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int len = 0;
        while (right < arr.length){
            if (sum == k){
                len = Math.max(len,right-left+1);
                sum -= arr[left++];
            }else if(sum<k){
                right++;
                if(right == arr.length){
                    break;
                }
                sum += arr[right];
            }else {
                sum -= arr[left++];
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[]arr = new int[]{1,5,5,2,6,7,2,4};
        System.out.println(_32getMaxLength.getMaxLength(arr,13));
    }
}
