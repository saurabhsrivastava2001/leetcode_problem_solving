//Leetcode_2089 in java using quicksort for sorting in O(nlogn) time complexity but you compromised with the space
class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n= nums.length;
       quickSort(nums, 0, n - 1);
       List<Integer> ans = new ArrayList<Integer>();
       for (int i = 0;i<n;i++){{
           if (nums[i]==target){
             ans.add(i);
           }
       }}
       return ans;
    }
        static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
     static int partition(int[] arr, int low, int high)
    {
 
        // pivot
        int pivot = arr[high];
        int i = (low - 1);
 
        for (int j = low; j <= high - 1; j++) {
 
               if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }
    static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    } 
    
}