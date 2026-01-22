public class ProblemSet2 {

    public static void main(String[] args) {

        /*
         Presentation Flow:
         i)   Understand the problem
         ii)  Brute force approach
         iii) Optimal approach
        */

        // ========================================================================================
        // QUESTION 1: Rotate the array by ONE place
        // Link:
        // https://www.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1
        // ========================================================================================

        int[] ques1 = {1, 2, 3, 3, 5, 3, 6};

        /*
         -------- Left Rotation (Anti-clockwise) --------
         Idea:
         - Store first element
         - Shift elements left
         - Put stored element at the end

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        int temp = ques1[0];
        for (int i = 1; i < ques1.length; i++) {
            ques1[i - 1] = ques1[i];
        }
        ques1[ques1.length - 1] = temp;

        /*
         -------- Right Rotation (Clockwise) --------
         Idea:
         - Store last element
         - Shift elements right
         - Put stored element at index 0

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        int n = ques1.length;
        int temp2 = ques1[n - 1];

        for (int i = n - 1; i > 0; i--) {
            ques1[i] = ques1[i - 1];
        }
        ques1[0] = temp2;
        */


        // ========================================================================================
        // QUESTION 2: Rotate the array by K places
        // Links:
        // https://leetcode.com/problems/rotate-array/
        // https://www.geeksforgeeks.org/problems/rotate-array-by-n-elements-1587115621/1
        // ========================================================================================

        /*
         -------- Brute Force Approach --------
         Steps:
         1) Store first k elements in temp array
         2) Shift remaining elements
         3) Copy temp back

         Time Complexity: O(n + k)
         Space Complexity: O(k)
        */

        /*
        int n = arr.length;
        k = k % n;

        int[] tempArr = new int[k];

        for (int i = 0; i < k; i++) {
            tempArr[i] = arr[i];
        }

        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }

        for (int i = n - k; i < n; i++) {
            arr[i] = tempArr[i - (n - k)];
        }
        */

        /*
         -------- Optimal Approach (Reversal Algorithm) --------
         Observation:
         Rotation can be solved using array reversal

         Left Rotation by k:
         1) Reverse (0 → k-1)
         2) Reverse (k → n-1)
         3) Reverse (0 → n-1)

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        static void rotateArr(int[] arr, int k) {
            int n = arr.length;
            k = k % n;

            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        }

        static void reverse(int[] arr, int left, int right) {
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        */

        /*
         Notes:
         - Left Rotation:
           Reverse (0 → k-1), (k → n-1), then (0 → n-1)

         - Right Rotation:
           Reverse (0 → n-1), (0 → k-1), then (k → n-1)
        */


        // ========================================================================================
        // QUESTION 3: Move all zeroes to the end
        // Links:
        // https://www.geeksforgeeks.org/problems/move-all-zeroes-to-end-of-array0751/1
        // https://leetcode.com/problems/move-zeroes/description/
        // ========================================================================================

        /*
         -------- Brute Force --------
         - Store non-zero elements separately
         - Copy back and fill rest with zero

         Time Complexity: O(n)
         Space Complexity: O(n)
        */

        /*
         -------- Optimal (Two-pointer / Index approach) --------
         - Keep index for non-zero position
         - Overwrite array
         - Fill remaining with zero

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        int index = 0;

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        while (index < nums.length) {
            nums[index++] = 0;
        }
        */


        // ========================================================================================
        // QUESTION 4: Linear Search (First & Last Occurrence)
        // Link:
        // https://www.geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
        // ========================================================================================

        /*
         -------- Idea --------
         - Traverse array once
         - First time: store first index
         - Keep updating last index

         Time Complexity: O(n)
         Space Complexity: O(1)
        */

        /*
        int[] ques4 = {2, 1, 4, 2, 5, 3, 6, 3};
        int x = 6;

        int first = -1;
        int last = -1;

        for (int i = 0; i < ques4.length; i++) {
            if (ques4[i] == x) {
                if (first == -1) {
                    first = i;
                }
                last = i;
            }
        }
        */

    }
}
