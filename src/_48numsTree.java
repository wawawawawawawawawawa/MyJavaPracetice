public class _48numsTree {
//    统计所有可能的不同的二叉树
//    动态规划做法
    public int numTree(int n){
        if(n<2){
            return 1;
        }
        int[]num = new int[n+1];
        num[0]=1;
        for (int i=1;i<n+1;i++){
            for (int j=1;j<i+1;j++){
                num[i] = num[j-1]+num[i-j];  //左子树可能的数量加右子树可能的数量
            }
        }
        return num[n];
    }
}
