class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length-1){
            if(nums[i]!=nums[nums[i]-1]){
            int temp=nums[i];
            nums[i]=nums[temp-1];
            nums[temp-1]=temp;}
            else i++;
        }
        for(int j=0;j<nums.length;j++){
            if(j+1!=nums[j]) return nums[j];
        }
        return nums.length;
    }
}
