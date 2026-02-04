# 📌 2D Arrays in Java — Complete Notes

---

## 1️⃣ What is a 2D Array?

A **2D array** is an array of arrays.
It represents data in **rows and columns** (matrix / grid).

Example:

```
1  2  3
4  5  6
7  8  9
```

In Java:

```java
int[][] matrix;
```

---

## 2️⃣ Memory Representation (Very Important)

Java **does NOT store 2D arrays contiguously** like C/C++.

Instead:

```
matrix → references → 1D arrays
```

Example:

```java
int[][] arr = new int[3][4];
```

* `arr` has **3 references (rows)**
* Each reference points to a **1D array of size 4**
* Rows can have **different sizes** (jagged arrays)

---

## 3️⃣ Declaration & Initialization

### Declaration

```java
int[][] arr;
```

### Initialization

```java
arr = new int[3][3];
```

### Declaration + Initialization

```java
int[][] arr = new int[3][3];
```

### With values

```java
int[][] arr = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};
```

---

## 4️⃣ Accessing Elements

```java
arr[row][col]
```

Example:

```java
int val = arr[1][2]; // row 1, col 2
```

⚠️ Index starts from **0**

---

## 5️⃣ Traversing a 2D Array

### Row-wise Traversal (Most common)

```java
for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}
```

### Using Enhanced For Loop

```java
for (int[] row : arr) {
    for (int val : row) {
        System.out.print(val + " ");
    }
    System.out.println();
}
```

---

## 6️⃣ Input in 2D Array

```java
Scanner sc = new Scanner(System.in);
int[][] arr = new int[n][m];

for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        arr[i][j] = sc.nextInt();
    }
}
```

---

## 7️⃣ Row-wise vs Column-wise Thinking 🧠

### Row-wise

* Fix row, move columns

```java
arr[i][j]
```

### Column-wise

* Fix column, move rows

```java
arr[j][i]
```

👉 Many problems depend only on **how you traverse**.

---

## 8️⃣ Common 2D Array Patterns (VERY IMPORTANT)

### 🔹 Row Sum

```java
for (int i = 0; i < n; i++) {
    int sum = 0;
    for (int j = 0; j < m; j++) {
        sum += arr[i][j];
    }
}
```

### 🔹 Column Sum

```java
for (int j = 0; j < m; j++) {
    int sum = 0;
    for (int i = 0; i < n; i++) {
        sum += arr[i][j];
    }
}
```

---

## 9️⃣ Matrix Boundaries (Interview Favorite)

For a matrix `n x m`:

* Top row → `row = 0`
* Bottom row → `row = n - 1`
* Left column → `col = 0`
* Right column → `col = m - 1`

---

## 🔟 Diagonals

### Primary Diagonal

Condition:

```java
i == j
```

### Secondary Diagonal

Condition:

```java
i + j == n - 1
```

---

## 1️⃣1️⃣ Transpose of Matrix

### Concept

Rows become columns.

### Code

```java
int[][] transpose = new int[m][n];

for (int i = 0; i < n; i++) {
    for (int j = 0; j < m; j++) {
        transpose[j][i] = arr[i][j];
    }
}
```

👉 For **square matrix**, transpose can be done in-place.

---

## 1️⃣2️⃣ Spiral Traversal (Classic)

Direction order:
➡️ right → ⬇️ down → ⬅️ left → ⬆️ up

Key variables:

```java
top, bottom, left, right
```

Pattern:

* Move left → right
* top++
* Move top → bottom
* right--
* Move right → left
* bottom--
* Move bottom → top
* left++

---

## 1️⃣3️⃣ Rotate Matrix (90° Clockwise)

### Steps:

1. Transpose the matrix
2. Reverse each row

Used in:

* Image rotation
* Game boards
* Interview problems

---

## 1️⃣4️⃣ Searching in 2D Array

### Normal Search

```java
O(n * m)
```

### Sorted Matrix Search (Optimal)

If:

* Rows sorted
* Columns sorted

Start from:

```java
top-right OR bottom-left
```

Time:

```java
O(n + m)
```

---

## 1️⃣5️⃣ Prefix Sum Matrix (Advanced)

Used for:

* Submatrix sum
* Range queries

Formula:

```java
prefix[i][j] =
arr[i][j]
+ prefix[i-1][j]
+ prefix[i][j-1]
- prefix[i-1][j-1]
```

Submatrix sum in O(1) 🚀

---

## 1️⃣6️⃣ Difference Between 1D & 2D Thinking

| 1D            | 2D              |
| ------------- | --------------- |
| Single index  | Two indices     |
| Linear        | Grid based      |
| One direction | Four directions |

---

## 1️⃣7️⃣ Direction Arrays (Advanced Trick)

Used in:

* BFS / DFS
* Islands / Grids

```java
int[] dx = {0, 1, 0, -1};
int[] dy = {1, 0, -1, 0};
```

Move in 4 directions using loop.

---

## 1️⃣8️⃣ Common Mistakes ⚠️

❌ Using `arr[0].length` everywhere
❌ Forgetting jagged arrays
❌ Confusing row & column
❌ Out-of-bound indexing
❌ Wrong loop order

---

## 1️⃣9️⃣ Must-Practice Problem Types

* Row/Column sum
* Spiral traversal
* Matrix rotation
* Transpose
* Diagonal traversal
* Search in sorted matrix
* Set matrix zeroes
* Pascal’s triangle
* Submatrix sum

---

## 🧠 Universal Approach to Any 2D Problem

Ask yourself:

1. How many rows?
2. How many columns?
3. Which direction to move?
4. Fixed row or fixed column?
5. Boundary conditions?

---
