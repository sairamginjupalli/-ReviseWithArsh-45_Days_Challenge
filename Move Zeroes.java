class Solution {
    public void moveZeroes(int[] nums) {
        int i=0,j=1,length=nums.length;
        if(nums[i]!=0)i++;
        while(j<length)
        {
            if(nums[j]!=0)
            {
                
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;

        }
    }
}
