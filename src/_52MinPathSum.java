public class _52MinPathSum {
    public int MinPathSum(int[][]arr){
        if (arr==null||arr.length==0||arr[0]==null||arr[0].length==0){
            return 0;
        }
        int row = arr.length;
        int col = arr[0].length;
        int[][]MPS = new int[row][col];
        MPS[0][0] = arr[0][0];
        for (int i=1;i<row;i++){
            MPS[i][0] = MPS[i-1][0]+arr[i][0];
        }
        for (int j = 1;j<col;j++){
            MPS[0][j] = MPS[0][j-1]+arr[0][j];
        }

        for (int i=1;i<row;i++){
            for (int j=1;j<col;j++){
                MPS[i][j] = Math.min(MPS[i-1][j],MPS[i][j-1])+arr[i][j];
            }
        }
        return MPS[row-1][col-1];
    }
}
