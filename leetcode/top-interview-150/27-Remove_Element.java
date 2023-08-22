class Solution {
    public int removeElement(int[] nums, int val) {
        int removeCnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                removeCnt++;
            } else {
                nums[i - removeCnt] = nums[i];
            }
        }

        return nums.length - removeCnt;
    }
}