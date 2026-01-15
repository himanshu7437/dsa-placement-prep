# ⚡ Quick Sort — From Scratch

## 🧠 Core Idea (MOST IMPORTANT)

> **Pick a pivot element and place it at its correct position such that:**

* Elements **smaller than pivot** are on the left
* Elements **greater than pivot** are on the right
  Then recursively apply the same logic on left and right parts.

📌 Pivot is in its **final sorted position** after partitioning.

---

## 🧩 Why Quick Sort is Fast?

* Does **not** merge like merge sort
* Works **in-place**
* Smaller subarrays → faster recursion

---

## 📦 Dry Run Example (VERY IMPORTANT)

### Input:

```
arr = [10, 7, 8, 9, 1, 5]
```

### Step 1:

Choose pivot = **last element → 5**

Partition:

```
[1 | 5 | 10,7,8,9]
```

Array becomes:

```
[1, 5, 10, 7, 8, 9]
```

Pivot index = 1

---

### Step 2:

Left part → `[1]` (already sorted)
Right part → `[10, 7, 8, 9]`

Repeat recursively…

Final sorted:

```
[1, 5, 7, 8, 9, 10]
```

---

## ⚙️ Algorithm (Plain English)

1. Choose a pivot
2. Rearrange array so:

   * left < pivot
   * right > pivot
3. Pivot reaches correct index
4. Recursively apply on left & right

---

## 🧪 Quick Sort Code (Java)

```java
public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {

        /*
         * Time Complexity:
         * - Best Case: O(n log n)
         * - Average Case: O(n log n)
         * - Worst Case: O(n^2)
         *
         * Space Complexity:
         * - O(log n)  (recursive stack)
         */

        if (low < high) {

            // Partition index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort left and right
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int pivot = arr[high]; // choose last element as pivot
        int i = low - 1;       // index of smaller element

        for (int j = low; j < high; j++) {

            // If current element is smaller than pivot
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot at correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // pivot index
    }
}
```

---

## 📊 Time Complexity Explained

### ✅ Best Case — O(n log n)

* Pivot splits array into **equal halves**

### ⚠️ Average Case — O(n log n)

* Random pivot → balanced partitions

### ❌ Worst Case — O(n²)

* Pivot is always smallest or largest
* Example:

```
Already sorted array
```

---

## 🎯 Key Properties (Interview Table)

| Property   | Value      |
| ---------- | ---------- |
| Stable     | ❌ No       |
| In-place   | ✅ Yes      |
| Worst Case | O(n²)      |
| Average    | O(n log n) |
| Recursion  | Yes        |

---

## 👍 Pros

✅ Very fast in practice
✅ In-place sorting
✅ Cache friendly
✅ Used in real systems

---

## 👎 Cons

❌ Worst case O(n²)
❌ Not stable
❌ Recursion overhead

---

## 🧠 How to Avoid Worst Case?

* Use **random pivot**
* Use **median of three**
* Shuffle array before sorting

---

## 🎯 Interview Tip

If interviewer asks:

> “Why Quick Sort is faster than Merge Sort?”

Answer:

> “Because it works in-place and has better cache performance.”

---