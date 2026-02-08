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


        
    }
}
