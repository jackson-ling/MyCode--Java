package Leetcode_704;

// 本题默认数组无重复元素

public class Solution1 {

    // 逐个遍历匹配
    // 时间复杂度：O（n）
    public int search(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }

}

