# 📦 INTRODUCTION TO ARRAYS (Deep Dive)

---

## 🔹 1. What is an Array? (Definition)

👉 **Array is a collection of elements of the same data type stored in contiguous memory locations.**

Example:

```java
int[] arr = {10, 20, 30, 40};
```

Here:

* All elements are `int`
* Stored **next to each other in memory**

---

## 🧠 Why Arrays Exist?

Imagine storing 100 marks:

❌ Without array:

```java
int m1, m2, m3, m4, ... m100;
```

✅ With array:

```java
int[] marks = new int[100];
```

✔ Clean
✔ Easy to manage
✔ Index-based access

---

## 🔹 2. Properties of Array (VERY IMPORTANT)

### ✅ Key Properties

1. **Fixed size**

   * Size is decided at creation
   * Cannot grow or shrink

2. **Same data type**

   * All elements must be of same type

3. **Contiguous memory**

   * Stored one after another

4. **Index-based access**

   * Access via index (0-based in Java)

5. **Random access**

   * Can access any element in O(1)

---

## 🔹 3. Declaration of Array

### 📌 Declaration Only (No memory)

```java
int[] arr;
```

👉 No memory allocated yet

---

### 📌 Declaration + Memory Allocation

```java
int[] arr = new int[5];
```

* Size = 5
* Default values assigned

---

### 📌 Declaration + Initialization

```java
int[] arr = {1, 2, 3, 4, 5};
```

---

## 🔹 4. Array in `main()` vs Global (CRITICAL CONCEPT)

### 📍 Inside `main()` (Local Array)

```java
public static void main(String[] args) {
    int[] arr = new int[5];
}
```

✔ Stored in **Heap**
✔ Reference stored in **Stack**
✔ Default values → `0`

---

### 📍 Global Array (Class Level)

```java
class Test {
    static int[] arr = new int[5];
}
```

✔ Memory allocated before `main()`
✔ Default values → `0`
✔ Accessible everywhere in class

---

### ⚠️ Java DOES NOT HAVE GARBAGE VALUES

| Language | Uninitialized Array Values |
| -------- | -------------------------- |
| Java     | `0`, `false`, `null`       |
| C/C++    | Garbage values ❌           |

---

## 🔹 5. Default Values in Java Arrays

| Data Type | Default Value |
| --------- | ------------- |
| int       | 0             |
| float     | 0.0           |
| char      | '\u0000'      |
| boolean   | false         |
| Object    | null          |

---

## 🔹 6. Maximum Size of Array (VERY IMPORTANT FOR CP)

### 🔹 Inside `main()` (Local)

```
~ 10^6 (1 million)
```

Example:

```java
int[] arr = new int[1_000_000];
```

---

### 🔹 Globally (Static)

```
~ 10^7 (10 million)
```

Example:

```java
static int[] arr = new int[10_000_000];
```

⚠️ Depends on memory limits, but **this rule is widely used in CP**.

---

## 🔹 7. Accessing Elements of an Array

### 📌 Syntax

```java
arr[index]
```

Example:

```java
int[] arr = {10, 20, 30};

System.out.println(arr[0]); // 10
System.out.println(arr[2]); // 30
```

---

### ⛔ Invalid Access

```java
arr[5]; // ArrayIndexOutOfBoundsException
```

Indexes range:

```
0 → size-1
```

---

## 🔹 8. How Arrays Are Stored in Memory (MOST IMPORTANT 🔥)

### 📌 Contiguous Memory Allocation

Example:

```java
int[] arr = {10, 20, 30};
```

Memory looks like:

| Address | Value |
| ------- | ----- |
| 1000    | 10    |
| 1004    | 20    |
| 1008    | 30    |

(assuming int = 4 bytes)

---

### 🧠 Address Formula (Interview Favorite 💡)

```
Address of arr[i] = base_address + (i * size_of_data_type)
```

Example:

```
arr[2] = 1000 + (2 * 4) = 1008
```

👉 This is why **random access is O(1)**

---

## 🔹 9. Why Array Access Is O(1)

Because:

* Address is calculated directly
* No traversal needed

⏱ Time Complexity:

```java
// Access
arr[i] → O(1)
```

---

## 🔹 10. Common Array Operations & Complexity

```java
// Traversal
O(n)

// Access
O(1)

// Search (unsorted)
O(n)

// Insert/Delete (middle)
O(n)
```

---

## 🔹 11. Advantages of Arrays

✅ Fast access
✅ Simple structure
✅ Cache-friendly
✅ Less memory overhead

---

## 🔹 12. Disadvantages of Arrays

❌ Fixed size
❌ Insertion & deletion costly
❌ Memory wastage possible

---

## 🔹 13. Types of Arrays

### 1️⃣ 1D Array

```java
int[] arr = new int[5];
```

### 2️⃣ 2D Array

```java
int[][] matrix = new int[3][4];
```

### 3️⃣ Jagged Array

```java
int[][] jagged = new int[3][];
```

---

## 🧠 Interview Gold Summary 🏆

> **Array is a fixed-size, contiguous memory data structure that allows O(1) indexed access but O(n) insertion and deletion.**

---