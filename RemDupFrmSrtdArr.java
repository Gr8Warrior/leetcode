package leetcode;

import java.util.HashMap;

class RemDupFrmSrtdArr{

    public static void main(String[] args) {
        System.out.println("Shailu");
        int array[] = { 1, 1, 2, 2, 11, 15 };
        int result = removeDuplicates(array);
        System.out.println(result);
    }

    public static int removeDuplicates(int[] nums) {
        int currentIndex = 0;

        HashMap <Integer,Integer> map = new HashMap<>();

        for(int i =0; i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                nums[currentIndex] = nums[i];
                map.put(nums[i],i);
                currentIndex++;
            }
        }
        return currentIndex;
        
    }
}

