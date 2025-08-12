package matrix;

public class DiagonalSum {
    public static int diagonalSum(int[][] mat) {
        int totalSum = 0;
        int n = mat.length; // Ma trận vuông nxn
        int primarySum = 0;
        int secondarySum = 0;

        // Tính tổng đường chéo chính
        for(int i = 0; i < n; i++){
            primarySum += mat[i][i];
        }

        // Tính tổng đường chéo phụ
        for(int i = 0; i < n; i++){
            secondarySum += mat[i][n-1-i];
        }

        // Nếu ma trận có kích thước lẻ, trừ đi phần tử trung tâm bị tính 2 lần
        if(n % 2 == 1){
            totalSum = primarySum + secondarySum - mat[n/2][n/2];
        } else {
            totalSum = primarySum + secondarySum;
        }
        return totalSum;
    }
}
