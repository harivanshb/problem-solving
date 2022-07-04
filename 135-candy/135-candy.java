class Solution {

    public int candy(int[] ratings) {
        int count = 1;
        int sum = 0;
        int[] candy = new int[ratings.length];
        if (ratings.length == 1) {
            return 1;
        } else {
            int i;
            for (int k = 0; k < candy.length; k++) {
                candy[k] = count;
            }
            for (i = 0; i < ratings.length - 1; i++) {
                if (ratings[i + 1] > ratings[i]) {
                    candy[i + 1] = candy[i] + 1;
                }
            }
            for (i = ratings.length - 1; i > 0; i--) {
                if (ratings[i - 1] > ratings[i]) {
                    if (candy[i - 1] < candy[i] + 1) {
                        candy[i - 1] = candy[i] + 1;
                    }
                }
            }
        }
        for (int i = 0; i < candy.length; i++) {
            System.out.println(candy[i]);
            sum += candy[i];
        }
        return sum;
    }
}
