public class _25removeNodeWired {
    public void removeNodeWired(Node node){
//        不知道头结点的情况下删除指定节点
        if(node == null){
            return;
        }
        Node next = node.next;
        if(next == null){
            throw new RuntimeException("can not remove last node");
        }
        node.value = next.value;
        node.next = next.next;
    }
}
