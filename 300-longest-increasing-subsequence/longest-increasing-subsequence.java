class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Arrays.fill(res,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
            if(nums[i]>nums[j])
            res[i]=Math.max(res[j]+1,res[i]);
        }
    }
     int max=0;
    for(int i=0;i<n;i++){
        max=Math.max(res[i],max);
}
return max;
}
}