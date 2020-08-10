public class _17PartitionList {
    public Node partitionList(Node head,int pilot){
        if(head == null){
            return head;
        }
        Node cur = head;
        int n = 0;
        while (cur != null){
            n++;
            cur = cur.next;
        }
        Node[] arr = new Node[n];
        for(int i=0;i != arr.length;i++){
            arr[i] = cur;
            cur = cur.next;
        }
        ArrPartition(arr,pilot);
        for(int i=1;i!=arr.length;i++){
            arr[i-1].next = arr[i];
        }
        arr[n-1].next = null;
        return arr[0];
    }

    public void swap(Node[] arr,int a,int b){
        Node tmp = arr[a];
        arr[a] = arr[b];
        arr[b] =tmp;
    }

    public void ArrPartition(Node[]arr,int pilot){
        int small = -1;
        int big = arr.length;
        int index = 0;
        while (index != big){
            if(arr[index].value < pilot){
                swap(arr,--small,index++);
            }else if(arr[index].value == pilot){
                index++;
            }else {
                swap(arr,--big,index);
            }
        }
    }
}
