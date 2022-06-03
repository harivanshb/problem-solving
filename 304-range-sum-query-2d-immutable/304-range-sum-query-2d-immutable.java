class NumMatrix {
int[][] duplicate;
    public NumMatrix(int[][] matrix) {
           duplicate = matrix;
    }
    
        public int sumRegion(int row1, int col1, int row2, int col2) {
         int i,j,sum=0;
        for (i = row1; i <= row2; i++) {
            for ( j = col1; j <=col2;j++){
                sum+=duplicate[i][j];
            }
        }
        return sum;
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */