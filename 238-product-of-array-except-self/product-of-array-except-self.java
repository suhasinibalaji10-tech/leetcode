class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int[] front = new int[n];
        front[0] = 1;
        for (int i = 1; i < n; i++) {
            front[i] = front[i - 1] * nums[i - 1];
        }
        int[] back = new int[n];
        back[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            back[i] = back[i + 1] * nums[i + 1];
        }
        for (int i = 0; i < n; i++) {
            result[i] = front[i] * back[i];
        }
        return result;
    }
}
