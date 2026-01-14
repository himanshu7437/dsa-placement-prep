# 🔑 HASHING 

## 🤔 Problem First (Why Do We Need Hashing?)

👉 **Question:**
“How many times does a number appear in an array?”

Example:

```java
arr = [1, 2, 2, 3, 2, 1, 2, 3, 6, 4, 10]
```

How many times does:

* `1` appear?
* `2` appear?
* `3` appear?

---

# 🐌 Approach 1: Brute Force (Slow)

### 💡 Idea:

For **each number**, scan the **entire array**.

### Code:

```java
int countFrequency(int number, int[] arr) {
    int count = 0;
    for(int i = 0; i < arr.length; i++) {
        if(arr[i] == number) {
            count++;
        }
    }
    return count;
}
```

### ⏱️ Time Complexity:

* One query → `O(n)`
* 5 queries → `5 × O(n)`
* 1000 queries → `1000 × O(n)` 😵

❌ **Too slow** when queries are many.

---

# 🚀 Enter HASHING (Fast Way)

## 🔍 What is Hashing?

> **Hashing = Prestore data so you can fetch it quickly later**

Think like this:

* ❌ Don’t search again and again
* ✅ Count once, use many times

---

# 🧠 Core Idea of Hashing

1. **Precompute** (count everything once)
2. **Store** the counts
3. **Fetch** in O(1) time

---

# 🧮 ARRAY HASHING (Numbers)

### Given:

```java
arr = [1, 2, 2, 3, 2, 1, 2, 3, 6, 4, 10]
```

---

## 🪜 Step 1: Declare Hash Array

If max value = 10
Create array of size `11`

```java
int[] hash = new int[11];
```

---

## 🪜 Step 2: Precomputation (Counting)

```java
for(int i = 0; i < arr.length; i++) {
    hash[arr[i]]++;
}
```

### What happens internally?

| Number | Frequency |
| ------ | --------- |
| 1      | 2         |
| 2      | 4         |
| 3      | 2         |
| 4      | 1         |
| 6      | 1         |
| 10     | 1         |

Stored as:

```
hash[1] = 2
hash[2] = 4
hash[3] = 2
...
```

---

## 🪜 Step 3: Fetching (FAST 🚀)

```java
System.out.println(hash[2]); // 4
System.out.println(hash[1]); // 2
```

### ⏱️ Complexity:

```java
/*
Precomputation: O(n)
Each query: O(1)
*/
```

🔥 **This is why hashing is powerful**

---

# 🔤 CHARACTER HASHING (Strings)

### Example:

```java
String s = "abcdseacva";
```

We want frequency of each character.

---

## ❌ Brute Force (Bad)

For each character → scan entire string
❌ O(n²)

---

## ✅ Character Hashing (Best)

### ASCII trick:

* `'a'` → 97
* `'a' - 'a'` → 0
* `'b' - 'a'` → 1

---

### Step 1: Declare Hash Array

```java
int[] hash = new int[26]; // for a-z
```

---

### Step 2: Precompute

```java
for(int i = 0; i < s.length(); i++) {
    char ch = s.charAt(i);
    hash[ch - 'a']++;
}
```

---

### Step 3: Fetch

```java
System.out.println(hash['a' - 'a']); // frequency of 'a'
System.out.println(hash['c' - 'a']); // frequency of 'c'
```

---

### ⏱️ Complexity:

```java
/*
Time: O(n)
Space: O(26) ≈ O(1)
*/
```

---

# 🗂️ HASHMAP (When Range Is Large)

Array hashing ❌ fails when:

* numbers are large (10⁹)
* strings are arbitrary

### Use HashMap instead

---

## 📦 HashMap Example

```java
HashMap<Integer, Integer> map = new HashMap<>();

for(int num : arr) {
    map.put(num, map.getOrDefault(num, 0) + 1);
}
```

### Fetch:

```java
System.out.println(map.get(2)); // frequency of 2
```

---

### ⏱️ Complexity:

```java
/*
Insert: O(1) average
Fetch: O(1) average
Worst case: O(n) (rare)
*/
```

---

# 💥 Internal Collisions (Simple Idea)

Sometimes two keys want the **same place**.

This is called **collision**.

### Common methods (Just theory, no deep dive now):

* 🧮 **Division Method**
  `key % size`

* 📦 **Folding Method**
  Break number → add parts

* 🔢 **Mid-square Method**
  Square key → take middle digits

👉 Java handles this internally — you don’t worry now.

---