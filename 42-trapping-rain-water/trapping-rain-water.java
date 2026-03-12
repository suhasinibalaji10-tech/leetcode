class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] ltr=new int[n];
        int[] rtl=new int[n];
        ltr[0]=height[0];
        rtl[n-1]=height[n-1];
        for(int i=1;i<n;i++){
            ltr[i]=Math.max(height[i],ltr[i-1]);
        }
        for(int i=n-2;i>=0;i--){
            rtl[i]=Math.max(height[i],rtl[i+1]);
        }
        int result=0;
        for(int i=0;i<n;i++){
           result+=Math.min(ltr[i],rtl[i])-height[i];
        }
        return result;
    }
}