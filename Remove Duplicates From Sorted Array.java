class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=1,length=nums.length;
        while(j<length)
        {
            if(nums[i]!=nums[j])
            {
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}
