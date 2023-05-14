//leetcode_34 in java  ----------------problem statement---------------
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.

 
class Solution {
    public int[] searchRange(int[] nums, int target) {
                return new int[]{findFirstOccurrence(nums, target), findLastOccurrence(nums, target)};
    }

    private int findFirstOccurrence(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (nums[middle] == target) {
                firstOccurrence = middle;
                right = middle - 1;
            }
            else if (target < nums[middle]) {
                right = middle - 1;
            }
            else {
                left = middle + 1;
            }
        }
        return firstOccurrence;
    }

    private int findLastOccurrence(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        int lastOccurrence = -1;
        while (left <= right) {
            int middle = left + (right - left) / 2;
             if (nums[middle] == target) {
                lastOccurrence = middle;
                left = middle + 1;
            }
             else if (target < nums[middle]) {
                right = middle - 1;
            }
             else {
                left = middle + 1;
            }
        }
        return lastOccurrence;
    }
    }
