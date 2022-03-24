class Solution {
    public void moveZeroes(int[] nums) {
        int counter = 0;
        int n = nums.length;
        
        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                int temp = nums[counter];
                nums[counter] = nums[i];
                nums[i] = temp;
                counter++;
            }
        }
    }
}