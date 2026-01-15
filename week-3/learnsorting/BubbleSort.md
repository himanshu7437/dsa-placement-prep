# 🫧 Bubble Sort — From Scratch

## 🧠 Core Idea (Simple Words)

> **Repeatedly compare adjacent elements and swap them if they are in the wrong order.**
> After each pass, the **largest element “bubbles up” to the end**.

💡 That’s why it’s called **Bubble Sort** — big elements rise like bubbles.

---

## 📦 Example (Must Understand)

### Input:

```
arr = [5, 1, 4, 2, 8]
```

### Pass 1:

Compare adjacent elements:

```
(5,1) → swap → [1,5,4,2,8]
(5,4) → swap → [1,4,5,2,8]
(5,2) → swap → [1,4,2,5,8]
(5,8) → no swap
```

👉 Largest element `8` is now at the **end**

---

### Pass 2:

```
(1,4) → ok
(4,2) → swap → [1,2,4,5,8]
(4,5) → ok
```

---

### Pass 3:

No swaps → array already sorted
🛑 **Stop early**

---

## ⚙️ Algorithm (Plain English)

Repeat for `n-1` passes:

* Compare adjacent elements
* Swap if left > right
* After each pass, ignore last sorted elements
* If no swaps occur → array is sorted → break

---

## 🧪 Bubble Sort Code (Java)

```java
public class BubbleSort {

    public static void bubbleSort(int[] arr) {

        /*
         * Time Complexity:
         * - Best Case: O(n)
         *   (when array is already sorted - using early stopping)
         *
         * - Average Case: O(n^2)
         * - Worst Case: O(n^2)
         *
         * Space Complexity:
         * - O(1)
         *   In-place sorting
         */

        int n = arr.length;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {

            boolean swapped = false; // optimization flag

            // Inner loop for adjacent comparison
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if elements are in wrong order
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // If no swaps happened, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }
}
```

---

## 🎯 Key Properties (Interview Table)

| Property   | Value                     |
| ---------- | ------------------------- |
| Stable     | ✅ Yes                     |
| In-place   | ✅ Yes                     |
| Adaptive   | ✅ Yes (with swapped flag) |
| Best Case  | O(n)                      |
| Worst Case | O(n²)                     |

---

## 👍 Pros

✅ Very easy to understand
✅ Stable sorting algorithm
✅ Can stop early if array is sorted
✅ Good for teaching fundamentals

---

## 👎 Cons

❌ Extremely slow for large inputs
❌ Too many swaps
❌ Rarely used in real-world systems

---

## 🤔 Selection Sort vs Bubble Sort

| Feature       | Selection Sort | Bubble Sort |
| ------------- | -------------- | ----------- |
| Swaps         | Minimum        | Many        |
| Stable        | ❌              | ✅           |
| Best Case     | O(n²)          | O(n)        |
| Practical Use | Low            | Very Low    |

---

## 🧠 Interview Tip

If asked:

> “Why bubble sort is inefficient?”

Say:

> “Because it performs many unnecessary swaps and comparisons.”

---
