class Solution {
    public int removeElement(int[] nums, int val) {

        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                count++;
            }
        }

       int newArr[] = new int[nums.length - count];
       int j=0;

       for(int i=0;i<nums.length;i++){
        
        if(nums[i]!=val){
            newArr[j++]=nums[i];
        }

       }
       for(int i=0;i<j;i++){
        nums[i]=newArr[i];
       }

       return j;
        
    }
}