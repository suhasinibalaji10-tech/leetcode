class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            Queue<Integer> q = new LinkedList<>();

            for (int j = 0; j < nums2.length; j++) {
                q.add(nums2[j]);
            }

            boolean found = false;
            int nextGreater = -1;

            while (!q.isEmpty()) {
                int num = q.poll();

                if (num == nums1[i]) {
                    found = true;
                    continue;
                }

                if (found && num > nums1[i]) {
                    nextGreater = num;
                    break;
                }
            }

            result[i] = nextGreater;
        }

        return result;
    }
}
