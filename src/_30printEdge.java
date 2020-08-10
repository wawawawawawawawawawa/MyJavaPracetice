public class _30printEdge {
    public void printEdge(Node head){
        if (head == null){
            return;
        }
        int height = getHeight(head,0);
        Node[][]edgeMap = new Node[height][2];
        setEdgeMap(head,0,edgeMap);
        for (int i = 0;i<edgeMap.length;i++){
            System.out.print(edgeMap[i][0].value+"");
        }
        printLeafMap(head,0,edgeMap);
        for (int i = edgeMap.length-1;i!=-1;i--){
            System.out.print(edgeMap[i][1].value+"");
        }
    }

    public int getHeight(Node head,int l){
        if (head == null){
            return l;
        }
        return Math.max(getHeight(head.left, l+1),getHeight(head.right, l+1));
    }

    public void setEdgeMap(Node head,int l ,Node[][]edgeMap){
        if (head == null){
            return;
        }
        edgeMap[l][0] = edgeMap[l][0] == null ? head : edgeMap[l][0];
        edgeMap[l][1] = head;
        setEdgeMap(head.left,l+1,edgeMap);
        setEdgeMap(head.right,l+1,edgeMap);
    }

    public void printLeafMap(Node head,int l,Node[][]edgMap){
        if (head == null){
            return;
        }
        if (head.left ==null && head.right== null&& head != edgMap[l][0] && head != edgMap[l][1]){
            System.out.print(head.value+"");
        }
        printLeafMap(head.left,l+1,edgMap);
        printLeafMap(head.right,l+1,edgMap);
    }
}
