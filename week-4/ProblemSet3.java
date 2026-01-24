public class ProblemSet3 {

    public static void main(String[] args) {
        // ========================================================================================
        // Question 1: Find the Missing Number in an Array
        // Links:
        // https://leetcode.com/problems/missing-number/description/
        // https://www.geeksforgeeks.org/problems/missing-number-in-array1416/1
        // ========================================================================================

        /*
         Problem Understanding:
         - Array contains numbers from 0 to N
         - One number is missing
         - Array size = N
        */

        /*
         --------------------------------
         i) Brute Force Approach
         --------------------------------
         Idea:
         - Loop from 0 to N
         - For each number, check if it exists in the array
         - If not found, that number is missing

         Time Complexity: O(n^2)
         Space Complexity: O(1)
        */

        /*
        for (int i = 0; i <= nums.length; i++) {
            boolean found = false;

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return i;
            }
        }
        */

        /*
         --------------------------------
         ii) Better Approach (Hashing)
         --------------------------------
         Idea:
         - Use an auxiliary array to mark presence
         - The index with value 0 is the missing number

         Time Complexity: O(n)
         Space Complexity: O(n)
        */

        /*
        int[] hash = new int[nums.length + 1];

        for (int num : nums) {
            hash[num]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
                return i;
            }
        }
        */

        /*
         --------------------------------
         iii) Optimal Approaches
         --------------------------------
         a) Using Sum Formula
         b) Using XOR
        */

        /*
         a) Using Sum Formula
         Idea:
         - Sum of numbers from 0 to N = N * (N + 1) / 2
         - Subtract array sum from expected sum

         Note:
         - Use long to avoid integer overflow

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
        */

        /*
         b) Using XOR (Most Optimal & Safe)
         Idea:
         - XOR of same numbers = 0
         - XOR with 0 gives the number itself
         - Missing number remains after XOR

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        int xor1 = 0;
        int xor2 = 0;

        for (int i = 0; i < nums.length; i++) {
            xor1 = xor1 ^ i;
            xor2 = xor2 ^ nums[i];
        }

        xor1 = xor1 ^ nums.length;

        return xor1 ^ xor2;
        */



        // ========================================================================================
        // Question 2: Maximum Consecutive Ones
        // Link:
        // https://leetcode.com/problems/max-consecutive-ones/
        // ========================================================================================

        /*
         Problem Understanding:
         - Given a binary array
         - Find the maximum number of consecutive 1s
        */

        /*
         --------------------------------
         Optimal Approach
         --------------------------------
         Idea:
         - Maintain two variables:
           1) count → current streak of 1s
           2) maxCount → maximum streak found so far
         - Reset count when 0 appears

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        int maxCount = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }

        return maxCount;
        */
    }
}
