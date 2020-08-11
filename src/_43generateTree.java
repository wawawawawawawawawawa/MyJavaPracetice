public class _43generateTree {
    public Node generateTree(int[]arr){
        if (arr == null){
            return null;
        }
        return generate(arr,0,arr.length-1);
    }

    public Node generate(int[]arr,int start,int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        Node head = new Node(arr[mid]);
        head.left = generate(arr, start, mid - 1);
        head.right = generate(arr, mid + 1, end);
        return head;
    }
}
