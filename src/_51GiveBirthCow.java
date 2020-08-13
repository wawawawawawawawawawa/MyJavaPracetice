public class _51GiveBirthCow {
//    牛生牛问题，状态方程为C(n)=C(n-1)+C(n-3)，初始项为C(1)==1，C(2)==2，C(3)==3
    public static int GiveGirthCow(int n){
        if (n<1){
            return 0;
        }
        if (n ==1 || n == 2 || n==3){
            return n;
        }
        int res = 3;
        int pre = 2;
        int prePre = 1;
        int tmp1 = 0;
        int tmp2 = 0;
        for (int i =4;i<=n;i++){
            tmp1 = res;
            tmp2 = pre;
            res = res + prePre;
            pre = tmp1;
            prePre = tmp2;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(GiveGirthCow(6));
    }
}
