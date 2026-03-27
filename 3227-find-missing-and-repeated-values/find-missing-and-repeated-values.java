class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int n2 = n * n;
        
        long S = (long) n2 * (n2 + 1) / 2;
        long P = (long) n2 * (n2 + 1) * (2 * n2 + 1) / 6;
        
        long S_actual = 0, P_actual = 0;
        
        for (int[] row : grid) {
            for (int num : row) {
                S_actual += num;
                P_actual += (long) num * num;
            }
        }
        
        long diff1 = S_actual - S;
        long diff2 = P_actual - P;
        
        long sum_ab = diff2 / diff1;
        
        int a = (int) ((diff1 + sum_ab) / 2);
        int b = (int) (sum_ab - a);
        
        return new int[]{a, b};
    }
}