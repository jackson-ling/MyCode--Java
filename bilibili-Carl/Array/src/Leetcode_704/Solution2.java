package Leetcode_704;

public class Solution2 {

    // 二分查找，提高查找效率
    public int search(int[] nums, int target) {
        // 首先设置查找区间
        int left = 0, right = nums.length-1;
        while(left <= right){
//            int mid = (left + right) / 2;

            // 代码优化(左区间 + 一段距离 = 中点值位置)
            int mid = left + ((right - left) / 2);

            if(nums[mid] == target){
                return mid;
            }
            else if(target < nums[mid]){
                right = mid -1;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
        }
        // 没有找到，返回-1
        return -1;
    }
}




