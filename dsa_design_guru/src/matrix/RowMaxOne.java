package matrix;

public class RowMaxOne {
    public int[] findMaxOnesRow(int[][] mat) {
        int maxOnesIdx = 0;
        int maxOnesCount = 0;
        int n = mat.length;
        for(int i = 0; i < n; i++){
            int m = mat[i].length;
            int sum = 0;
            for(int j = 0; j < m; j++){
                if(mat[i][j] == 1) {
                    sum++;
                }
            }
            if(sum > maxOnesCount) {
                maxOnesCount = sum;
                maxOnesIdx = i;
            }
        }
        return new int[]{maxOnesIdx, maxOnesCount};
    }
}
