public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         * Presentation Flow (Interview Friendly):
         * i) Understand the problem & test cases
         * ii) Brute force approach
         * iii) Better approach (if possible)
         * iv) Optimal approach
         */

        // ----------------------------------------------------------------------------------------
        // Question 1: Largest element in an array
        // Link: https://www.geeksforgeeks.org/problems/largest-element-in-array4009/1
        // ----------------------------------------------------------------------------------------

        int[] arr = { 1, 2983, 334, 422, 5, 2983, 50, 3, 23 };

        /*
         * Brute Force:
         * - Sort the array
         * - The last element will be the largest
         * 
         * Time Complexity: O(n log n)
         * Space Complexity: O(1)
         * (Ignoring internal sorting space)
         */

        /*
         * Optimal Approach:
         * - Assume the first element is the maximum
         * - Traverse the array and update max if a larger element is found
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int maxElem = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxElem) {
                maxElem = arr[i];
            }
        }

        System.out.println("The maximum value in the array is: " + maxElem);

        // ----------------------------------------------------------------------------------------
        // Question 2: Second Largest Element in an Array (Without Sorting)
        // ----------------------------------------------------------------------------------------

        /*
         * Brute Force:
         * - Sort the array
         * - Traverse from the end and find the first element
         * that is not equal to the largest
         * 
         * Time Complexity: O(n log n + n)
         * Space Complexity: O(1)
         */

        /*
         * Better Approach:
         * - First pass: find the largest element
         * - Second pass: find the largest element smaller than the max
         * 
         * Time Complexity: O(n + n) → O(n)
         * Space Complexity: O(1)
         */

        int largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("The second largest element is: " + secondLargest);

        /*
         * Optimal Approach (Single Pass):
         * - Maintain two variables:
         * 1) firstLargest
         * 2) secondLargest
         * - Update both in one traversal
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int firstLargest = arr[0];
        int secondLargestOptimal = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                secondLargestOptimal = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] < firstLargest && arr[i] > secondLargestOptimal) {
                secondLargestOptimal = arr[i];
            }
        }

        System.out.println("The second largest element (optimal) is: " + secondLargestOptimal);

        // ----------------------------------------------------------------------------------------
        // Question 3: Check if the array is sorted
        // Link:
        // https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1
        // ----------------------------------------------------------------------------------------

        int[] arr1 = { 1, 2, 3, 4, 5, 6, 7 };

        /*
         * Optimal Approach:
         * - Traverse the array once
         * - Check if every element is >= previous element
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        System.out.println("Is arr sorted?  " + isSorted(arr));
        System.out.println("Is arr1 sorted? " + isSorted(arr1));

        // ----------------------------------------------------------------------------------------
        // Related LeetCode Problem:
        // 1752. Check if Array Is Sorted and Rotated
        // https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
        // ----------------------------------------------------------------------------------------

        /*
         * Logic:
         * - Count how many times nums[i] > nums[i+1]
         * - If count > 1 → not sorted & rotated
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         * 
         * Note:
         * Modulo (%) helps compare last element with first element
         */

        // ----------------------------------------------------------------------------------------
        // Question 4: Remove duplicates from sorted array (in-place)
        // Links:
        // https://www.geeksforgeeks.org/problems/remove-duplicate-elements-from-sorted-array/1
        // https://leetcode.com/problems/remove-duplicates-from-sorted-array/
        // ----------------------------------------------------------------------------------------

        int[] nums = { 1, 1, 2, 2, 3, 4, 4, 5 };

        /*
         * Brute Force:
         * - Use a Set to store unique elements
         * - Copy back to array
         * 
         * Time Complexity: O(n log n)
         * Space Complexity: O(n)
         */

        /*
         * Optimal Approach (Two Pointer Technique):
         * - One pointer reads values
         * - One pointer writes unique values in-place
         * 
         * Time Complexity: O(n)
         * Space Complexity: O(1)
         */

        int newLength = removeDuplicates(nums);

        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    // ----------------------------------------------------------------------------------------
    // Solution 3: Check if array is sorted
    // ----------------------------------------------------------------------------------------
    public static boolean isSorted(int[] arr) {

        // Traverse from second element and compare with previous
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    // ----------------------------------------------------------------------------------------
    // Solution 4: Remove duplicates from sorted array
    // ----------------------------------------------------------------------------------------
    public static int removeDuplicates(int[] nums) {

        int writeIndex = 0;
        int i = 0;

        while (i < nums.length) {
            int currentValue = nums[i];

            // Skip all duplicates of currentValue
            while (i < nums.length && nums[i] == currentValue) {
                i++;
            }

            // Write unique value
            nums[writeIndex++] = currentValue;
        }

        return writeIndex; // New length of array
    }
}
