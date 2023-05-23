class Solution {
    public int singleNumber(int[] nums) {
      int ans = 0;

    for (final int num : nums)
      ans ^= num;//we will use XOR here and get the distinct item.for saME ITEMS XOR gives 0 , diff- 1 

    return ans;
  }
}
