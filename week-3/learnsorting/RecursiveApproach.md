# 🔁 Recursive Selection Sort

## 🧠 Idea

Normal selection sort:

* Fix one index
* Find minimum in remaining array
* Swap

👉 Recursive version:

* Fix the **first index**
* Find minimum index in remaining array
* Swap
* Recurse for the rest of array

---

## 🧪 Java Code (Recursive Selection Sort)

```java
public class RecursiveSelectionSort {

    public static void selectionSort(int[] arr, int start) {

        /*
         * Time Complexity:
         * - Best / Avg / Worst: O(n^2)
         *
         * Space Complexity:
         * - O(n) (recursion stack)
         */

        // Base case: only one element left
        if (start == arr.length - 1) {
            return;
        }

        // Find index of minimum element
        int minIndex = start;
        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        // Swap current element with minimum
        int temp = arr[start];
        arr[start] = arr[minIndex];
        arr[minIndex] = temp;

        // Recursive call for remaining array
        selectionSort(arr, start + 1);
    }
}
```

---

## 📦 Intuition

Each recursive call:

* Fixes **one element**
* Reduces problem size by 1

---

# 🔁 Recursive Bubble Sort

## 🧠 Idea

Normal bubble sort:

* Push largest element to the end in each pass

👉 Recursive version:

* One recursive call = **one bubble pass**
* Largest element moves to correct position
* Reduce array size

---

## 🧪 Java Code (Recursive Bubble Sort)

```java
public class RecursiveBubbleSort {

    public static void bubbleSort(int[] arr, int n) {

        /*
         * Time Complexity:
         * - Best: O(n)
         * - Avg / Worst: O(n^2)
         *
         * Space Complexity:
         * - O(n) (recursion stack)
         */

        // Base case
        if (n == 1) {
            return;
        }

        // One pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {

                // Swap adjacent elements
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Recursive call for remaining array
        bubbleSort(arr, n - 1);
    }
}
```

---

## 📦 Intuition

* Largest element settles at end
* Remaining problem size = `n - 1`

---

# 🔁 Recursive Insertion Sort

## 🧠 Idea

Normal insertion sort:

* Take an element
* Insert it into sorted left portion

👉 Recursive version:

* Assume first `n-1` elements are sorted
* Insert `nth` element into correct position

---

## 🧪 Java Code (Recursive Insertion Sort)

```java
public class RecursiveInsertionSort {

    public static void insertionSort(int[] arr, int n) {

        /*
         * Time Complexity:
         * - Best: O(n)
         * - Avg / Worst: O(n^2)
         *
         * Space Complexity:
         * - O(n) (recursion stack)
         */

        // Base case
        if (n <= 1) {
            return;
        }

        // Sort first n-1 elements
        insertionSort(arr, n - 1);

        // Insert nth element at correct position
        int last = arr[n - 1];
        int j = n - 2;

        while (j >= 0 && arr[j] > last) {
            arr[j + 1] = arr[j];
            j--;
        }

        arr[j + 1] = last;
    }
}
```

---

## 📦 Intuition

Each recursive call:

* Ensures left part is sorted
* Inserts one new element correctly

---

# 🧠 Comparison Summary

| Sort      | In-place | Stable | Best  | Worst |
| --------- | -------- | ------ | ----- | ----- |
| Selection | ✅        | ❌      | O(n²) | O(n²) |
| Bubble    | ✅        | ✅      | O(n)  | O(n²) |
| Insertion | ✅        | ✅      | O(n)  | O(n²) |

---

# 🎯 Interview Gold Tips

* Recursive versions are **conceptual questions**
* Real-world usage → **iterative**
* Interview focus → **base case + recursive reduction**

---