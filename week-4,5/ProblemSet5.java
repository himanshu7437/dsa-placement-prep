public class ProblemSet5 {

    public static void main(String[] args) {

        // ============================================================
        // ques - 1) Rearrange array elements by sign
        // ============================================================
        // link -
        // https://leetcode.com/problems/rearrange-array-elements-by-sign/


        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // - Create two separate arrays: one for positive, one for negative
        // - Traverse the input array and store values accordingly
        // - Merge them back alternately into a new array
        //
        // Time Complexity  - O(2n)
        // Space Complexity - O(n)
        //
        // Code:
        //
        // int n = nums.length;
        // int[] pos = new int[n / 2];
        // int[] neg = new int[n / 2];
        //
        // int p = 0, q = 0;
        //
        // for (int num : nums) {
        //     if (num > 0) pos[p++] = num;
        //     else neg[q++] = num;
        // }
        //
        // int[] result = new int[n];
        // for (int i = 0; i < n / 2; i++) {
        //     result[2 * i] = pos[i];
        //     result[2 * i + 1] = neg[i];
        // }
        //
        // return result;


        // ------------------------------------------------------------
        // ii) Optimal Approach
        // ------------------------------------------------------------
        // Idea:
        // - Use two pointers
        // - Place positive numbers at even indices
        // - Place negative numbers at odd indices
        //
        // Time Complexity  - O(n)
        // Space Complexity - O(n)
        //
        // Code:
        //
        // int n = nums.length;
        // int[] result = new int[n];
        //
        // int pos = 0, neg = 1;
        //
        // for (int num : nums) {
        //     if (num > 0) {
        //         result[pos] = num;
        //         pos += 2;
        //     } else {
        //         result[neg] = num;
        //         neg += 2;
        //     }
        // }
        //
        // return result;


        // ============================================================
        // ques - 2) Next Permutation
        // ============================================================
        // link -
        // https://leetcode.com/problems/next-permutation/description/


        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // - Generate all permutations in sorted order
        // - Perform a linear search to find the next permutation
        //
        // Time Complexity  - O(n^2)
        // Space Complexity - O(n)
        //
        // No need to code (inefficient approach)


        // ------------------------------------------------------------
        // ii) Optimal Approach
        // ------------------------------------------------------------
        // Idea:
        // 1) Find the first index from the right where nums[i] < nums[i+1]
        // 2) Swap it with the smallest number greater than it on the right
        // 3) Reverse the remaining suffix
        //
        // Time Complexity  - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        //
        // class Solution {
        //     public void nextPermutation(int[] nums) {
        //         int idx = -1;
        //         int n = nums.length;
        //
        //         // Step 1: find breakpoint
        //         for (int i = n - 2; i >= 0; i--) {
        //             if (nums[i] < nums[i + 1]) {
        //                 idx = i;
        //                 break;
        //             }
        //         }
        //
        //         // If no breakpoint, reverse whole array
        //         if (idx == -1) {
        //             reverseArr(0, n, nums);
        //             return;
        //         }
        //
        //         // Step 2: find next greater element
        //         for (int i = n - 1; i > idx; i--) {
        //             if (nums[i] > nums[idx]) {
        //                 int temp = nums[i];
        //                 nums[i] = nums[idx];
        //                 nums[idx] = temp;
        //                 break;
        //             }
        //         }
        //
        //         // Step 3: reverse suffix
        //         reverseArr(idx + 1, n, nums);
        //     }
        //
        //     public void reverseArr(int i, int j, int[] nums) {
        //         int left = i;
        //         int right = j - 1;
        //
        //         while (left < right) {
        //             int temp = nums[left];
        //             nums[left] = nums[right];
        //             nums[right] = temp;
        //             left++;
        //             right--;
        //         }
        //     }
        // }
    }
}
