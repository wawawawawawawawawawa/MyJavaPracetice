package sort;

public class _selectSort {
//    选择排序
    public static void selectSort(int[]arr){
        if (arr==null||arr.length<2){
            return;
        }
        for (int i=0;i< arr.length-1;i++){
            int minIndex = i;
            for (int j=i+1;j<arr.length;j++){
                minIndex = arr[minIndex] > arr[j] ? j:minIndex;
            }
            swap(arr,minIndex,i);
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
