class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];

        int str = 0;
        int end = nums.length-1;

        int ptr = nums.length-1;

        while (str<=end){
            if((nums[str]*nums[str])>(nums[end]*nums[end])){
                ans[ptr] = nums[str]*nums[str];
                str++;

            }
            else{
                ans[ptr] = nums[end]*nums[end];
                end--;
            }
            ptr--;
        }

        return  ans;       
    }
}
