class Solution {
    public int maximumProduct(int[] nums) {
        if(nums.length < 3) {
            return 0;
        }
        //Sorting the array
       Arrays.sort(nums);
       //Product of all the positive numbers;
       int product1 = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
       //Product of two negative numbers then the one positive number
       int product2 = nums[0] * nums[1] * nums[nums.length - 1];
       return product1 > product2 ? product1 : product2;
        
    }
}
