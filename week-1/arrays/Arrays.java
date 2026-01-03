package arrays;

/*
 * =========================================================
 *                      JAVA ARRAYS
 * =========================================================
 *
 * Arrays are used to store **multiple values** of the same type
 * in a single variable.
 *
 * Advantages of arrays:
 * 1️⃣ Easy to manage multiple related values
 * 2️⃣ Helps in loops and DSA algorithms
 *
 * Types of arrays:
 * - Single-dimensional array
 * - Multi-dimensional array (2D, 3D)
 */

public class Arrays {

    public static void main(String[] args) {

        /*
         * =================================================
         * 1️⃣ SINGLE-DIMENSIONAL ARRAYS
         * =================================================
         */

        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]); // 10
        System.out.println("Third element: " + numbers[2]); // 30

        // Length of the array
        System.out.println("Array length: " + numbers.length); // 5

        // Looping through array using for loop
        System.out.println("\nArray elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Looping using enhanced for loop
        System.out.println("\nUsing enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        /*
         * =================================================
         * 2️⃣ MODIFYING ARRAY ELEMENTS
         * =================================================
         */

        numbers[1] = 25; // Change second element
        System.out.println("\nAfter modifying second element:");
        for (int num : numbers) {
            System.out.println(num);
        }

        /*
         * =================================================
         * 3️⃣ ARRAY ARITHMETIC EXAMPLES
         * =================================================
         */

        // Sum of all elements
        int sum = 0;
        for (int num : numbers) {
            sum += num; // arithmetic operator +
        }
        System.out.println("\nSum of array elements: " + sum);

        // Average
        double avg = (double) sum / numbers.length; // arithmetic operators + /
        System.out.println("Average: " + avg);

        /*
         * =================================================
         * 4️⃣ MULTI-DIMENSIONAL ARRAYS (2D)
         * =================================================
         */

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Access element at row 2, column 3
        System.out.println("\nElement at row 2, col 3: " + matrix[1][2]); // 6

        // Looping through 2D array
        System.out.println("\nMatrix elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * =================================================
         * 5️⃣ COMMON ARRAY OPERATIONS
         * =================================================
         *
         * 1. Finding maximum element
         * 2. Finding minimum element
         * 3. Searching for a value
         * 4. Sorting (simple bubble sort example)
         */

        // Maximum
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("\nMaximum element: " + max);

        // Minimum
        int min = numbers[0];
        for (int num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("Minimum element: " + min);

        // Searching for 30
        boolean found = false;
        for (int num : numbers) {
            if (num == 30) {
                found = true;
                break; // stop loop once found
            }
        }
        System.out.println("30 found? " + found);

        // Sorting array (Bubble Sort)
        int[] arr = {5, 2, 8, 1, 3};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) { // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("\nSorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        /*
         * =================================================
         * KEY TAKEAWAYS
         * =================================================
         *
         * - Arrays store multiple values of the same type
         * - Index starts from 0
         * - Use loops to traverse arrays
         * - Arithmetic operators are often used with arrays:
         *   sum, average, min, max, etc.
         * - 2D arrays are like matrices (row x column)
         */
    }
}
