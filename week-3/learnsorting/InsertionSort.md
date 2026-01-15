# 🧩 Insertion Sort — From Scratch

## 🧠 Core Idea (Very Intuitive)

> **Insert each element into its correct position in the already sorted part of the array.**

Think of:
🃏 **Arranging playing cards in your hand**

* Left side → already sorted
* Pick one card → insert it at the right position

---

## 🧱 Concept Breakdown

* First element is **always sorted**
* Start from index `1`
* Take current element → `key`
* Shift all larger elements to the right
* Insert `key` in correct place

---

## 📦 Dry Run Example (IMPORTANT)

### Input:

```
arr = [8, 3, 5, 2]
```

### Step 1:

```
[8] 3 5 2   → 8 is sorted
```

### Step 2:

Insert `3`:

```
[3, 8] 5 2
```

### Step 3:

Insert `5`:

```
[3, 5, 8] 2
```

### Step 4:

Insert `2`:

```
[2, 3, 5, 8]
```

Sorted ✅

---

## ⚙️ Algorithm (Plain English)

For each element from index `1`:

1. Store current value (`key`)
2. Compare with elements on left
3. Shift larger elements right
4. Insert `key` at correct place

---

## 🧪 Insertion Sort Code (Java)

```java
public class InsertionSort {

    public static void insertionSort(int[] arr) {

        /*
         * Time Complexity:
         * - Best Case: O(n)
         *   When array is already sorted
         *   (only one comparison per element)
         *
         * - Average Case: O(n^2)
         * - Worst Case: O(n^2)
         *   When array is reverse sorted
         *
         * Space Complexity:
         * - O(1)
         *   In-place sorting
         */

        int n = arr.length;

        // Start from second element
        for (int i = 1; i < n; i++) {

            int key = arr[i]; // element to insert
            int j = i - 1;

            // Shift elements greater than key to the right
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert key at correct position
            arr[j + 1] = key;
        }
    }
}
```

---

## 📊 Time Complexity Cases Explained

### ✅ Best Case — O(n)

```
[1, 2, 3, 4, 5]
```

* No shifting needed
* Just comparisons

---

### ⚠️ Average Case — O(n²)

* Random order
* Some shifts per element

---

### ❌ Worst Case — O(n²)

```
[5, 4, 3, 2, 1]
```

* Every element shifts completely
* Maximum operations

---

## 🎯 Key Properties (Interview Gold)

| Property   | Value |
| ---------- | ----- |
| Stable     | ✅ Yes |
| In-place   | ✅ Yes |
| Adaptive   | ✅ Yes |
| Best Case  | O(n)  |
| Worst Case | O(n²) |

---

## 👍 Pros

✅ Very efficient for **nearly sorted arrays**
✅ Stable sorting
✅ Used in **real-world hybrid algorithms**
✅ Easy to implement

---

## 👎 Cons

❌ Slow for large, random arrays
❌ Not suitable for big datasets

---

## 🧠 Where Is Insertion Sort Used?

* Inside **TimSort** (Java / Python)
* When array size is small
* When data is almost sorted

---

## 🎯 Interview Tip

If interviewer asks:

> “Which sorting algorithm is best for nearly sorted arrays?”

👉 **Insertion Sort**