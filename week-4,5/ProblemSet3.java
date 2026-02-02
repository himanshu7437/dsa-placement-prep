
public class ProblemSet3 {

    public static void main(String[] args) {
        // ========================================================================================
        // Question 1: Find the Missing Number in an Array
        // Links:
        // https://leetcode.com/problems/missing-number/description/
        // https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
        // ========================================================================================

        /*
         * Problem Understanding:
         * - Array contains numbers from 0 to N
         * - One number is missing
         * - Array size = N
         */

        /*
         * --------------------------------
         * i) Brute Force Approach
         * --------------------------------
         * Idea:
         * - Loop from 0 to N
         * - For each number, check if it exists in the array
         * - If not found, that number is missing
         * 
         * Time Complexity: O(n^2)
         * Space Complexity: O(1)
         */

        /*
         * for (int i = 0; i <= nums.length; i++) {
         * boolean found = false;
         * 
         * for (int j = 0; j < nums.length; j++) {
         * if (nums[j] == i) {
         * found = true;
         * break;
         * }
         * }
         * 
         * if (!found) {
         * return i;
         * }
         * }
         */

        /*
         * --------------------------------
         * ii) Better Approach (Hashing)
         * --------------------------------
         * Idea:
         * - Use an auxiliary array to mark presence
         * - The index with value 0 is the missing number
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(n)
         */

        /*
         * int[] hash = new int[nums.length + 1];
         * 
         * for (int num : nums) {
         * hash[num]++;
         * }
         * 
         * for (int i = 0; i < hash.length; i++) {
         * if (hash[i] == 0) {
         * return i;
         * }
         * }
         */

        /*
         * --------------------------------
         * iii) Optimal Approaches
         * --------------------------------
         * a) Using Sum Formula
         * b) Using XOR
         */

        /*
         * a) Using Sum Formula
         * Idea:
         * - Sum of numbers from 0 to N = N * (N + 1) / 2
         * - Subtract array sum from expected sum
         * 
         * Note:
         * - Use long to avoid integer overflow
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        /*
         * int n = nums.length;
         * int expectedSum = n * (n + 1) / 2;
         * int actualSum = 0;
         * 
         * for (int num : nums) {
         * actualSum += num;
         * }
         * 
         * return expectedSum - actualSum;
         */

        /*
         * b) Using XOR (Most Optimal & Safe)
         * Idea:
         * - XOR of same numbers = 0
         * - XOR with 0 gives the number itself
         * - Missing number remains after XOR
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        /*
         * int xor1 = 0;
         * int xor2 = 0;
         * 
         * for (int i = 0; i < nums.length; i++) {
         * xor1 = xor1 ^ i;
         * xor2 = xor2 ^ nums[i];
         * }
         * 
         * xor1 = xor1 ^ nums.length;
         * 
         * return xor1 ^ xor2;
         */

        // ========================================================================================
        // Question 2: Maximum Consecutive Ones
        // Link:
        // https://leetcode.com/problems/max-consecutive-ones/
        // ========================================================================================

        /*
         * Problem Understanding:
         * - Given a binary array
         * - Find the maximum number of consecutive 1s
         */

        /*
         * --------------------------------
         * Optimal Approach
         * --------------------------------
         * Idea:
         * - Maintain two variables:
         * 1) count → current streak of 1s
         * 2) maxCount → maximum streak found so far
         * - Reset count when 0 appears
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        /*
         * int maxCount = 0;
         * int count = 0;
         * 
         * for (int i = 0; i < nums.length; i++) {
         * 
         * if (nums[i] == 1) {
         * count++;
         * maxCount = Math.max(maxCount, count);
         * } else {
         * count = 0;
         * }
         * }
         * 
         * return maxCount;
         */


        // ques - 3) Number that appears once while others appear twice
        // link -
        // https://www.geeksforgeeks.org/problems/element-appearing-once2552/1
        // https://leetcode.com/problems/single-number/description/

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // Pick each element and do a linear search to check
        // whether it appears again in the array.
        // If it does not, that element is the answer.
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        //
        // Code:
        // for(int i = 0; i < nums.length; i++) {
        // int currentElement = nums[i];
        // int count = 0;
        //
        // for(int j = 0; j < nums.length; j++) {
        // if(i != j && nums[j] == currentElement) {
        // count++;
        // break;
        // }
        // }
        //
        // if(count == 0) return currentElement;
        // }
        // return -1;

        // ------------------------------------------------------------
        // ii) Better Approach (Hashing)
        // ------------------------------------------------------------
        // Idea:
        // Use a HashMap to store the frequency of each element.
        // Then find the element whose frequency is exactly 1.
        //
        // Time Complexity - O(n)
        // Space Complexity - O(n)
        //
        // Code:
        // Map<Integer, Integer> map = new HashMap<>();
        //
        // for(int num : nums) {
        // map.put(num, map.getOrDefault(num, 0) + 1);
        // }
        //
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if(entry.getValue() == 1) {
        // return entry.getKey();
        // }
        // }
        //
        // return -1;

        // ------------------------------------------------------------
        // iii) Optimal Approach (XOR)
        // ------------------------------------------------------------
        // Idea:
        // XOR of two same numbers is 0.
        // XOR of a number with 0 is the number itself.
        // Since all numbers appear twice except one,
        // the final XOR result will be the number that appears once.
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        // int xor = 0;
        // for(int num : nums) {
        // xor = xor ^ num;
        // }
        // return xor;

        // Note:
        // There is another approach using Binary Search,
        // which will be discussed later.

        
        // ques - 4) Longest subarray with sum K
        // ------------------------------------------------------------

        // ------------------------------------------------------------
        // i) Brute Force
        // ------------------------------------------------------------
        // Idea:
        // Generate all possible subarrays and calculate their sum.
        // If the sum equals K, update the maximum length.
        //
        // Time Complexity - O(n^2)
        // Space Complexity - O(1)
        //
        // Code:
        // for(int i = 0; i < n; i++) {
        // int sum = 0;
        // for(int j = i; j < n; j++) {
        // sum += arr[j];
        // if(sum == k) {
        // maxLen = Math.max(maxLen, j - i + 1);
        // }
        // }
        // }

        // ------------------------------------------------------------
        // ii) Better Approach (Hashing / Prefix Sum)
        // ------------------------------------------------------------
        // Idea:
        // Use a HashMap to store the first occurrence of each prefix sum.
        // If (currentSum - k) exists in the map, a subarray with sum K exists.
        //
        // Important Notes:
        // - This approach works for arrays containing
        // positive, negative, and zero values.
        // - If the array contains only positive numbers,
        // a more optimal solution exists (sliding window).
        //
        // Time Complexity - O(n log n) (O(n) with HashMap in practice)
        // Space Complexity - O(n)
        //
        // Code:
        // Map<Long, Integer> map = new HashMap<>();
        // long sum = 0;
        // int maxLen = 0;
        //
        // for(int i = 0; i < n; i++) {
        // sum += arr[i];
        //
        // if(sum == k) {
        // maxLen = i + 1;
        // }
        //
        // if(map.containsKey(sum - k)) {
        // maxLen = Math.max(maxLen, i - map.get(sum - k));
        // }
        //
        // if(!map.containsKey(sum)) {
        // map.put(sum, i);
        // }
        // }
        //
        // return maxLen;

        // ------------------------------------------------------------
        // iii) Optimal Approach (Two Pointer / Sliding Window)
        // ------------------------------------------------------------
        // Idea:
        // This approach works only when the array contains
        // non-negative (positive or zero) elements.
        // We maintain a window using two pointers and adjust
        // the window size based on the current sum.
        //
        // Time Complexity - O(n)
        // Space Complexity - O(1)
        //
        // Code:
        //
        // public static int longestSubarrayWithSumK(int arr[], int k) {
        // int left = 0, right = 0;
        // long sum = 0;
        // int n = arr.length;
        // int maxLen = 0;
        //
        // while(right < n) {
        //
        // // Expand the window
        // sum += arr[right];
        //
        // // Shrink the window if sum exceeds k
        // while(left <= right && sum > k) {
        // sum -= arr[left];
        // left++;
        // }
        //
        // // Check if current window sum equals k
        // if(sum == k) {
        // maxLen = Math.max(maxLen, right - left + 1);
        // }
        //
        // right++;
        // }
        //
        // return maxLen;
        // }

    }
}
