class Solution {
    public int totalNQueens(int n) {
        boolean [][] board = new boolean[n][n];
        return size(board,0);
    }
    
    private static int size(boolean[][] sheet, int row) {

        if (row == sheet.length) {
            return 1;
        }
        int count = 0;
        for (int col = 0; col < sheet.length; col++) {
            if (isSafe(sheet, col, row)) {
                sheet[row][col] = true;
                count += size(sheet, row + 1);
                sheet[row][col] = false;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] sheet, int col, int row) {
        //upwards
        for(int i=0;i<row;i++){
            if(sheet[i][col]){
                return false;
            }
        }

        //diag left
        int maxLeft = Math.min(row,col);
        for(int i =1; i<=maxLeft;i++){
            if(sheet[row-i][col-i]){
                return false;
            }
        }
        //diag right

        int maxRight = Math.min(row,sheet.length-col-1);
        for(int i = 1; i<=maxRight;i++){
            if(sheet[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}