import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int ele = stack.pop();
                res[ele] = prices[ele] - prices[i]; 
            }
            stack.push(i);
            res[i] = prices[i]; 
        }
        
        return res;
    }
}
