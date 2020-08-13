package sort;

public class insertSort {
//    插入排序
    public static void insertSort(int[]arr){
        if (arr == null || arr.length<2){
            return;
        }
        for (int i = 1;i<arr.length;i++){
            for (int j = i;j>0;j--){
                if (arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
    }
    public static void swap(int[]arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        int[]arr = new int[]{2,5,8,7,3,6,9};
        insertSort.insertSort(arr);
        for (int i = 0;i< arr.length-1;i++){
            System.out.print(arr[i]+"  ");
        }
    }
}
