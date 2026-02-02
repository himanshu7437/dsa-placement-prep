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
        // Time Complexity - O(2n)
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
        // if (num > 0) pos[p++] = num;
        // else neg[q++] = num;
        // }
        //
        // int[] result = new int[n];
        // for (int i = 0; i < n / 2; i++) {
        // result[2 * i] = pos[i];
        // result[2 * i + 1] = neg[i];
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
        // Time Complexity - O(n)
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
        // if (num > 0) {
        // result[pos] = num;
        // pos += 2;
        // } else {
        // result[neg] = num;
        // neg += 2;
        // }
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
        // Time Complexity - O(n^2)
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
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        //
        // class Solution {
        // public void nextPermutation(int[] nums) {
        // int idx = -1;
        // int n = nums.length;
        //
        // // Step 1: find breakpoint
        // for (int i = n - 2; i >= 0; i--) {
        // if (nums[i] < nums[i + 1]) {
        // idx = i;
        // break;
        // }
        // }
        //
        // // If no breakpoint, reverse whole array
        // if (idx == -1) {
        // reverseArr(0, n, nums);
        // return;
        // }
        //
        // // Step 2: find next greater element
        // for (int i = n - 1; i > idx; i--) {
        // if (nums[i] > nums[idx]) {
        // int temp = nums[i];
        // nums[i] = nums[idx];
        // nums[idx] = temp;
        // break;
        // }
        // }
        //
        // // Step 3: reverse suffix
        // reverseArr(idx + 1, n, nums);
        // }
        //
        // public void reverseArr(int i, int j, int[] nums) {
        // int left = i;
        // int right = j - 1;
        //
        // while (left < right) {
        // int temp = nums[left];
        // nums[left] = nums[right];
        // nums[right] = temp;
        // left++;
        // right--;
        // }
        // }
        // }

        // ============================================================
        // ques - 3) Leaders in the array
        // ============================================================

        /*
         * A leader is an element that is greater than all elements to its right.
         * The rightmost element is always a leader.
         */

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // - For every element, check all elements to its right
        // - If no element on the right is greater, it is a leader
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        // (O(n) if result list is considered)
        //
        // Code:
        /*
         * List<Integer> leaders = new ArrayList<>();
         * 
         * for (int i = 0; i < arr.length; i++) {
         * boolean isLeader = true;
         * 
         * for (int j = i + 1; j < arr.length; j++) {
         * if (arr[j] > arr[i]) {
         * isLeader = false;
         * break;
         * }
         * }
         * 
         * if (isLeader) {
         * leaders.add(arr[i]);
         * }
         * }
         */

        // ------------------------------------------------------------
        // ii) Optimal Approach
        // ------------------------------------------------------------
        // Idea:
        // - Traverse from right to left
        // - Maintain maxRight
        // - If current element > maxRight → leader
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        // (O(n) if result list is considered)
        //
        // Code:
        /*
         * List<Integer> leaders = new ArrayList<>();
         * 
         * int maxRight = Integer.MIN_VALUE;
         * 
         * for (int i = arr.length - 1; i >= 0; i--) {
         * if (arr[i] > maxRight) {
         * leaders.add(arr[i]);
         * maxRight = arr[i];
         * }
         * }
         * 
         * // Optional: reverse leaders if order matters
         * Collections.reverse(leaders);
         */

        // ============================================================
        // ques - 4) Longest Consecutive Sequence in an array
        // ============================================================
        // link -
        // https://leetcode.com/problems/longest-consecutive-sequence/description/

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // - For every element, try to build a consecutive sequence
        // - Check if next numbers exist using linear search
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        //
        // Code:
        /*
         * int longest = 0;
         * 
         * for (int i = 0; i < arr.length; i++) {
         * int currentNum = arr[i];
         * int count = 1;
         * 
         * while (contains(arr, currentNum + 1)) {
         * currentNum++;
         * count++;
         * }
         * 
         * longest = Math.max(longest, count);
         * }
         * 
         * // helper function
         * boolean contains(int[] arr, int target) {
         * for (int num : arr) {
         * if (num == target) return true;
         * }
         * return false;
         * }
         */

        // ------------------------------------------------------------
        // ii) Better Approach (Sorting)
        // ------------------------------------------------------------
        // Idea:
        // - Sort the array
        // - Count consecutive elements
        // - Skip duplicates
        //
        // Time Complexity - O(n log n)
        // Space Complexity - O(1)
        //
        // Code:
        /*
         * Arrays.sort(arr);
         * 
         * int longest = 1;
         * int count = 1;
         * 
         * for (int i = 1; i < arr.length; i++) {
         * if (arr[i] == arr[i - 1]) {
         * continue; // skip duplicates
         * } else if (arr[i] == arr[i - 1] + 1) {
         * count++;
         * } else {
         * longest = Math.max(longest, count);
         * count = 1;
         * }
         * }
         * 
         * longest = Math.max(longest, count);
         */

        // ------------------------------------------------------------
        // iii) Optimal Approach (HashSet)
        // ------------------------------------------------------------
        // Idea:
        // - Insert all elements into a HashSet
        // - Start sequence only if (num - 1) does not exist
        // - Expand forward
        //
        // Time Complexity - O(n)
        // Space Complexity - O(n)
        //
        // Code:
        /*
         * Set<Integer> set = new HashSet<>();
         * for (int num : arr) {
         * set.add(num);
         * }
         * 
         * int longest = 0;
         * 
         * for (int num : set) {
         * if (!set.contains(num - 1)) { // start of sequence
         * int current = num;
         * int count = 1;
         * 
         * while (set.contains(current + 1)) {
         * current++;
         * count++;
         * }
         * 
         * longest = Math.max(longest, count);
         * }
         * }
         */

    }
}
