# 🔁 RECURSION

We’ll cover:

1. What recursion really is
2. How recursion works internally (stack)
3. Core components (must-know)
4. How to THINK in recursion (this is key)
5. Types of recursion
6. Pros & Cons
7. Common mistakes
8. Template you can reuse everywhere
9. First example with dry run

---

## 1️⃣ What is Recursion?

> **Recursion is when a function calls itself to solve a smaller version of the same problem.**

### Simple definition:

* Solve a big problem
* By breaking it into **smaller subproblems**
* Until you reach a **simple case you already know**

---

## 2️⃣ Real-Life Analogy 🪜 (Very Important)

Imagine stairs:

* You want to reach stair `n`
* To reach `n`, you must reach `n-1`
* To reach `n-1`, you must reach `n-2`
* …
* Eventually you reach stair `0` (ground)

That’s recursion.

---

## 3️⃣ The 3 Mandatory Parts of Any Recursion

### ✅ 1. Base Case

* Stops recursion
* Prevents infinite calls

```java
if (n == 0) return;
```

### ✅ 2. Recursive Call

* Function calls itself with a **smaller input**

```java
solve(n - 1);
```

### ✅ 3. Progress Toward Base Case

* Input must move **closer** to base case
  ❌ Otherwise → Stack Overflow

---

## 4️⃣ How Recursion Works Internally (CALL STACK)

Example:

```java
print(3);
```

Call stack:

```
print(3)
 └─ print(2)
     └─ print(1)
         └─ print(0)  ← base case hit
```

Then stack **unwinds** (returns back).

---

## 5️⃣ MOST IMPORTANT: How to THINK in Recursion 🧠

### Golden Rule:

> **Never think about the entire recursion. Think only ONE step.**

### Ask yourself:

1. What does my function do for `n`?
2. Can I trust it will work for `n-1`?
3. What is the smallest problem (base case)?

---

## 6️⃣ Universal Recursion Template (MEMORIZE THIS)

```java
public class Recursion {

    static void solve(int n) {

        // Base case
        if (n == 0) return;

        // Work (optional: before recursive call)

        solve(n - 1);   // Recursive call

        // Work (optional: after recursive call)
    }
}
```

This template solves:

* Print 1 to N
* Print N to 1
* Factorial
* Sum of numbers
* Fibonacci
* Reverse array/string

---

## 7️⃣ Example 1: Print Numbers 1 to N

```java
public class Recursion {

    static void print1ToN(int n) {

        /*
         Time Complexity: O(n)
         Space Complexity: O(n)
         Explanation:
         - Function is called n times
         - Recursive stack stores n calls
         */

        if (n == 0) return;

        print1ToN(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        print1ToN(5);
    }
}
```

### Output:

```
1 2 3 4 5
```

---

## 8️⃣ Dry Run (IMPORTANT)

Call:

```
print1ToN(3)
```

Steps:

```
print1ToN(3)
 → print1ToN(2)
   → print1ToN(1)
     → print1ToN(0) → return
     ← print 1
   ← print 2
 ← print 3
```

---

## 9️⃣ Types of Recursion (You MUST Know)

### 🔹 1. Tail Recursion

Recursive call is last statement

```java
fun(n - 1);
```

### 🔹 2. Head Recursion

Work after recursive call

```java
fun(n - 1);
print(n);
```

### 🔹 3. Tree Recursion

Multiple recursive calls

```java
fib(n-1) + fib(n-2);
```

---

## 🔟 Pros & Cons of Recursion

### ✅ Pros

* Clean and readable code
* Perfect for divide & conquer
* Natural fit for trees, graphs, backtracking

### ❌ Cons

* Extra memory (stack)
* Slower than loops
* Risk of StackOverflowError

---

## 1️⃣1️⃣ Common Mistakes (Avoid These)

❌ Missing base case
❌ Base case never reached
❌ Changing wrong variable
❌ Large recursion depth
❌ Not understanding stack flow

---

## 1️⃣2️⃣ When to Use Recursion?

✔ Tree / Graph traversal
✔ Backtracking (subsets, permutations)
✔ Divide & Conquer
✔ Mathematical problems

❌ Simple loops (prefer iteration)

---
