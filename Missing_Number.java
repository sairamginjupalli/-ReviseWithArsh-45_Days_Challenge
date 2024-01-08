//Source : leetcode ,  question No : 268.

class Solution {
    public int missingNumber(int[] nums) {
     // [4,1,3,0]
        int i=0;
        while(i<nums.length){ //0<4

            if(nums[i]<nums.length && nums[i]!=nums[nums[i]]) //4<4   
            {
                int temp=nums[i];
                nums[i]=nums[temp];
                nums[temp]=temp;
            }
            else{
                i++;
            }

        }
        int j;
        for(j=0;j<nums.length;j++)
        {
            if(j!=nums[j])
            {
                return j;
            }
        }
        return nums.length;
    }
}
