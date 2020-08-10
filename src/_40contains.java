public class _40contains {
//    判断t1的拓扑结构是不是包含t2的拓扑结构
    public boolean contains(Node t1,Node t2){
        return check(t1,t2) || check(t1.left,t2.left) || check(t1.right,t2.right);
    }

    public boolean check(Node t1,Node t2){
        if (t2 == null){
            return true;
        }
        if (t1 == null || t1.value != t2.value){
            return false;
        }
        return check(t1.left,t2.left) && check(t1.right,t2.right);
    }
}
