class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;

        // Defining an array of n+1 size
        int[] arr=new int[n+1];
         
        // storing the empty array with -1  with arr[num[i]] traversing from start element of the nums 
         int ans=0;
         for(int i=0;i<nums.length;i++){

        // And checking that if the arr element is -1 then it means nums[i] is the repeated element
        // otherwise we will store that array index as -1
            if(arr[nums[i]]==-1){
                ans=nums[i];
                break;
            }else{
                arr[nums[i]]=-1;
            }
         }
         return ans;

    }
}