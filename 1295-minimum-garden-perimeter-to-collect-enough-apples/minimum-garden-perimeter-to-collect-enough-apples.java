class Solution {
    public long minimumPerimeter(long neededApples) {
                long n=0;
        long totalApples=0;
        while(totalApples<neededApples){
            n=n+1;
            totalApples+= 12*n*n;
        }
        return 8*n;
    }
}