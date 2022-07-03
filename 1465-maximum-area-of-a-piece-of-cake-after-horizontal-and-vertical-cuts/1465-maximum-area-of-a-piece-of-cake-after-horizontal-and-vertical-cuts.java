class Solution {

    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int horizontalMax = horizontalCuts[0] - 0;
        for (int i = 1; i < horizontalCuts.length; i++) {
            horizontalMax = Math.max(horizontalMax, horizontalCuts[i] - horizontalCuts[i - 1]);
        }
        horizontalMax = Math.max(horizontalMax, h - horizontalCuts[horizontalCuts.length - 1]);

        System.out.println(horizontalMax);

        int verticalMax = verticalCuts[0] - 0;
        for (int i = 1; i < verticalCuts.length; i++) {
            verticalMax = Math.max(verticalMax, verticalCuts[i] - verticalCuts[i - 1]);
        }
        verticalMax = Math.max(verticalMax, w - verticalCuts[verticalCuts.length - 1]);
        System.out.println(verticalMax);

        return (int) ((long) horizontalMax * verticalMax % 1000000007);
    }
}
