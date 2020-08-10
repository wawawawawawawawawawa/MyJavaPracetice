public class _36bstTopoSize {
    public int bstPotoSize(Node head){
        if (head == null){
            return 0;
        }
        int max = maxTopo(head,head);
        max = Math.max(bstPotoSize(head.left),max);
        max = Math.max(bstPotoSize(head.right),max);
        return max;
    }

    public int maxTopo(Node h,Node n){
        if (h != null && n != null && isBSTTopo(h,n,n.value)){
            return maxTopo(h,n.left) + maxTopo(h,n.right) + 1;
        }
        return 0;
    }

    public boolean isBSTTopo(Node h,Node n,int value){
        if(h == null){
            return false;
        }
        if(n == h){
            return true;
        }
        return isBSTTopo(h.value>value?h.left:h.right,n, value);
    }
}
