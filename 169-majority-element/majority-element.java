class Solution {
    public int majorityElement(int[] nums) {
        // Arrays.sort(nums);
        // int n = nums.length-1;
        // return nums[n/2];


        // int n = nums.length;
        // int ans = 0;
        // for(int i = 0;i<nums.length;i++){
        //     int count = 0;
        //     for(int j = 0;j<nums.length;j++){
        //       if(nums[i]==nums[j]){
        //         count++;
        //       }
        //     }
        //     if(count>n/2){
        //     ans = nums[i];
        //     }
        // }
        // return ans;


        int elem = 0;
        int count = 0;
        for(int i :nums){
            if(count==0){
                elem = i;
            }
            if(i==elem){
                count++;
            }else{
                count--;
            }
        }
        return elem;
    }
}