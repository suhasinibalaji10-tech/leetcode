class Solution {
  public int gcd(int a,int b){
    if(b==0){
      return a;
    }
    return gcd(b,a%b);
  }
    public int minOperations(int[] nums, int[] numsDivide) {
        Arrays.sort(nums);
        int gcd_val = numsDivide[0];
        for(int i = 1;i<numsDivide.length;i++){
          gcd_val = gcd(gcd_val,numsDivide[i]);
        } 
        for(int i = 0;i<nums.length;i++){
          if(gcd_val%nums[i]==0){
            return i;
          }
        }
        return -1;
    }
}