class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int count=0;
        int pos=0;
        for(int i=0;i<n;i++){
           if(nums[i]==0){
            count++;
           }
        }
        for(int i=0;i<n;i++){
          if(nums[i]!=0){
            nums[pos++]=nums[i];
          }
        }
        for( int i=n-count;i<n;i++){
            nums[i]=0;
        }
       
    }
}