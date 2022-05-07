class Solution {
    public int maximumWealth(int[][] accounts) {
        int i, j, sum = 0, temp = 0;
        for (i = 0; i < accounts.length; i++) {
            for (j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if (sum > temp)
                temp = sum;
            sum = 0;
        }
        return temp;
    }
}