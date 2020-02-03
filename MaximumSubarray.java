package leetcode;

class MaximumSubarray {
    public static void main(String[] args) {
        System.out.println("Shailu");
        int[] arr = {-2,-100,-3,1,-3,-229,-1,-5,-1};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums) {
       int sumOfCurrentSubArray = nums[0], maxSumOfSubArray = nums[0];
       
       for (int i = 1; i < nums.length; i++) {
           sumOfCurrentSubArray += nums[i];

           if(sumOfCurrentSubArray < nums[i]){
               sumOfCurrentSubArray = nums[i];
           }

           maxSumOfSubArray = Math.max(sumOfCurrentSubArray, maxSumOfSubArray);
           
       }
        return maxSumOfSubArray;   
    }
}