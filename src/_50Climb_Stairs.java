public class _50Climb_Stairs {
    public static int ClimbStairs(int n){
        if (n<1){
            return 0;
        }
        if (n==1||n==2){
            return n;
        }
        int pre = 1;
        int res = 2;
        int tmp = 0;
        for (int i=3;i<=n;i++){
            tmp = res;
            res = pre +res;
            pre = tmp;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(ClimbStairs(6));
    }
}
