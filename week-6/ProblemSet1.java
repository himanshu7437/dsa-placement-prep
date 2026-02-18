public class ProblemSet1 {

    public static void main(String[] args) {

        /*
         Presentation Flow:
         i)   Understand the problem
         ii)  Brute force approach
         iii) Optimal approach
        */

        // =====================================================================================
        // Question 1: Search a 2D Matrix
        // Link:
        // https://leetcode.com/problems/search-a-2d-matrix/submissions/1909116498/
        // =====================================================================================

        /*
         -------------------------------
         Brute Force Approach
         -------------------------------
         Idea:
         - Traverse the entire 2D matrix
         - Perform a linear search for the target

         Time Complexity: O(n * m)
         Space Complexity: O(1)
        */

        // Code
        /*
        class Solution {
            public boolean searchMatrix(int[][] matrix, int target) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[0].length; j++) {
                        if (matrix[i][j] == target) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }
        */

        /*
         -------------------------------
         Optimal Approach
         -------------------------------
         Idea:
         - Treat the 2D matrix as a sorted 1D array
         - Apply Binary Search (discussed later)

         Time Complexity: O(log(n * m))
         Space Complexity: O(1)
        */

        // =====================================================================================
        // Question 2: Spiral Traversal of a Matrix
        // Link:
        // https://www.geeksforgeeks.org/problems/spirally-traversing-a-matrix-1587115621/1
        // =====================================================================================

        /*
         -------------------------------
         Optimal Approach
         -------------------------------
         Idea:
         - Use four boundaries: top, bottom, left, right
         - Traverse layer by layer in spiral order

         Time Complexity: O(n * m)
         Space Complexity: O(1) [excluding output list]
        */

        // Code
        /*
        class Solution {
            public ArrayList<Integer> spirallyTraverse(int[][] mat) {

                ArrayList<Integer> result = new ArrayList<>();

                int n = mat.length;       // number of rows
                int m = mat[0].length;    // number of columns

                int top = 0, bottom = n - 1;
                int left = 0, right = m - 1;

                while (top <= bottom && left <= right) {

                    // Left → Right (top row)
                    for (int i = left; i <= right; i++) {
                        result.add(mat[top][i]);
                    }
                    top++;

                    // Top → Bottom (right column)
                    for (int i = top; i <= bottom; i++) {
                        result.add(mat[i][right]);
                    }
                    right--;

                    // Right → Left (bottom row)
                    if (top <= bottom) {
                        for (int i = right; i >= left; i--) {
                            result.add(mat[bottom][i]);
                        }
                        bottom--;
                    }

                    // Bottom → Top (left column)
                    if (left <= right) {
                        for (int i = bottom; i >= top; i--) {
                            result.add(mat[i][left]);
                        }
                        left++;
                    }
                }

                return result;
            }
        }
        */

        // =====================================================================================
        // Question 3: Median in a Row-wise Sorted Matrix
        // Link:
        // https://www.geeksforgeeks.org/problems/median-in-a-row-wise-sorted-matrix1527/1
        // =====================================================================================

        /*
        -------------------------------
        Brute Force Approach
        -------------------------------
        Idea:
        - Store all elements of the matrix in a 1D array
        - Sort the array
        - Return the middle element

        Time Complexity: O((n * m) + (n * m) log (n * m))
        Space Complexity: O(n * m)
        */

        // Code
        /*
        int n = mat.length;
        int m = mat[0].length;

        int[] arr = new int[n * m];
        int idx = 0;

        // Store all elements in 1D array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[idx++] = mat[i][j];
            }
        }

        // Sort the array
        Arrays.sort(arr);

        // Return median
        return arr[(n * m) / 2];
        */

        /*
        -------------------------------
        Optimal Approach
        -------------------------------
        Observation:
        - Each row is already sorted
        - Median is the element at position (n*m)/2 in sorted order
        - Use Binary Search on value range instead of indices

        Approach:
        - Find minimum element (first column)
        - Find maximum element (last column)
        - Binary search on the value range
        - Count how many elements are ≤ mid using binary search on each row

        Time Complexity: O(n * log m * log(max - min))
        Space Complexity: O(1)
        */

        // Code
        /*
        public int median(int[][] matrix, int n, int m) {

            int low = Integer.MAX_VALUE;
            int high = Integer.MIN_VALUE;

            // Find minimum and maximum values
            for (int i = 0; i < n; i++) {
                low = Math.min(low, matrix[i][0]);
                high = Math.max(high, matrix[i][m - 1]);
            }

            int required = (n * m) / 2;

            // Binary search on value range
            while (low <= high) {
                int mid = low + (high - low) / 2;
                int count = 0;

                // Count elements <= mid
                for (int i = 0; i < n; i++) {
                    count += upperBound(matrix[i], mid);
                }

                if (count <= required) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }

            return low;
        }

        // Upper bound: index of first element greater than target
        public int upperBound(int[] row, int target) {
            int low = 0, high = row.length;

            while (low < high) {
                int mid = low + (high - low) / 2;
                if (row[mid] <= target) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            return low;
        }
        */



        
    }
}
