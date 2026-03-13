import java.util.*;

class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (freq.containsKey(num)) {
                freq.put(num, freq.get(num) + 1);
            } else {
                freq.put(num, 1);
            }
        }
        int lucky = -1;
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (freq.get(num) == num) {
                if (num > lucky) {
                    lucky = num;
                }
            }
        }
        return lucky;
    }
}
