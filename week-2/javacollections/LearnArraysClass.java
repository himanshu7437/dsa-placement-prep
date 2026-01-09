import java.util.Arrays;

/*
 * =========================================================
 * 📘 LearnArraysClass.java
 * =========================================================
 * Goal:
 * - Understand java.util.Arrays utility class
 * - Learn common methods used in real projects
 * - Use this file for REVISION
 *
 * NOTE:
 * Arrays class works ONLY with ARRAYS (not ArrayList)
 * =========================================================
 */

public class LearnArraysClass {

    public static void main(String[] args) {

        /*
         * ---------------------------------------------------------
         * 1️⃣ What is Arrays Class? 🧰
         * ---------------------------------------------------------
         * Arrays is a utility class present in java.util package.
         *
         * It provides STATIC methods to:
         * ✔ Search
         * ✔ Sort
         * ✔ Fill
         * ✔ Compare arrays
         */

        /*
         * ---------------------------------------------------------
         * 2️⃣ binarySearch() 🔍
         * ---------------------------------------------------------
         * Searches element using Binary Search algorithm.
         *
         * IMPORTANT:
         * ✔ Array MUST be SORTED
         *
         * Time Complexity:
         * O(log n)
         */

        int[] numbers = {1, 2, 3, 4, 5, 6};

        int index = Arrays.binarySearch(numbers, 1);
        System.out.println("Index of 1: " + index);

        /*
         * If element is NOT found:
         * Returns: -(insertion point) - 1
         */

        /*
         * ---------------------------------------------------------
         * 3️⃣ sort() 🔃
         * ---------------------------------------------------------
         * Sorts array in ascending order.
         *
         * Time Complexity:
         * O(n log n)
         */

        int[] numbers1 = {11, 22, 13, 4, 5, 6};

        Arrays.sort(numbers1);

        System.out.println("After sorting:");
        for (int i : numbers1) {
            System.out.println(i);
        }

        /*
         * ---------------------------------------------------------
         * 4️⃣ fill() 🎨
         * ---------------------------------------------------------
         * Replaces ALL elements with given value.
         *
         * Time Complexity:
         * O(n)
         */

        Arrays.fill(numbers1, 13);

        System.out.println("After fill:");
        for (int i : numbers1) {
            System.out.println(i);
        }

        /*
         * ---------------------------------------------------------
         * 5️⃣ Other Useful Methods 📌
         * ---------------------------------------------------------
         *
         * Arrays.equals(arr1, arr2)  → Compare arrays
         * Arrays.toString(arr)       → Convert to String
         * Arrays.copyOf(arr, newLen) → Copy array
         */

        /*
         * ---------------------------------------------------------
         * ⭐ Final Summary
         * ---------------------------------------------------------
         * ✔ Arrays class works with primitive arrays
         * ✔ binarySearch requires sorted array
         * ✔ sort is widely used in DSA
         *
         * Interview Tip 💡:
         * Arrays.binarySearch() is faster than linear search
         * but only works correctly on sorted arrays.
         */
    }
}
