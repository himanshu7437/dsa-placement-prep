# 🔁 Selection Sort — From Scratch

## 🧠 Core Idea (Very Important)

> **Repeatedly select the smallest element from the unsorted part
> and put it at its correct position.**

Think like this 👇

* You divide the array into **two parts**:

  * ✅ **Sorted part** (left)
  * ❌ **Unsorted part** (right)
* Initially:

  * Sorted part = empty
  * Unsorted part = whole array

Each pass:

1. Find the **minimum element** in the unsorted part
2. **Swap** it with the first element of the unsorted part
3. Expand the sorted part by 1

---

## 📦 Example (Very Important to Understand)

### Input:

```
arr = [64, 25, 12, 22, 11]
```

### Pass 1:

* Minimum in whole array → **11**
* Swap with first element

```
[11, 25, 12, 22, 64]
```

### Pass 2:

* Minimum in remaining → **12**
* Swap with second position

```
[11, 12, 25, 22, 64]
```

### Pass 3:

* Minimum → **22**

```
[11, 12, 22, 25, 64]
```

### Sorted ✅

---

## ⚙️ Algorithm (Plain English)

For `i = 0 to n-2`

* Assume `i` is the index of minimum
* Check all elements from `i+1` to `n-1`
* If smaller element found → update min index
* Swap element at `i` with min index

---

## 🧪 Selection Sort Code (Java)

```java
public class SelectionSort {

    public static void selectionSort(int[] arr) {

        /*
         * Time Complexity:
         * - Best Case: O(n^2)
         * - Average Case: O(n^2)
         * - Worst Case: O(n^2)
         *
         * Reason:
         * - For every element, we scan the remaining array to find minimum
         *
         * Space Complexity:
         * - O(1)
         * - In-place sorting (no extra space used)
         */

        int n = arr.length;

        // Outer loop for each position
        for (int i = 0; i < n - 1; i++) {

            int minIndex = i; // assume current index is minimum

            // Find the minimum element in remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element is found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }
}
```

---

## 🎯 Key Properties (Interview Gold)

| Property    | Value           |
| ----------- | --------------- |
| Stable      | ❌ No            |
| In-place    | ✅ Yes           |
| Comparisons | Always O(n²)    |
| Swaps       | At most **n-1** |
| Adaptive    | ❌ No            |

---

## 👍 Pros

✅ Simple and easy to understand
✅ Performs **minimum number of swaps**
✅ Good when **swap cost is high**

---

## 👎 Cons

❌ Very slow for large inputs
❌ Always O(n²) (even if already sorted)
❌ Not stable (order of equal elements may change)

---

## 🤔 When to Use Selection Sort?

* Educational purposes 📘
* Very small arrays
* When **memory is extremely limited**
* When **swapping is costly**

---

## 🧠 Interview Tip

If interviewer asks:

> “Why is selection sort bad?”

Say:

> “Because it always takes O(n²) comparisons regardless of input order.”

---