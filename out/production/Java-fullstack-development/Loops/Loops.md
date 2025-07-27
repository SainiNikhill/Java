# Java Loops - Revision Guide

## 🚀 What are Loops?

Loops are used in Java to execute a block of code multiple times. They're essential for reducing repetition and writing efficient programs.

---

## 🔁 Types of Loops in Java

### 1. **`for` Loop**

**Use When:** You know exactly how many times you want to repeat something.

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Count: " + i);
}
```

📌 **Example Use Cases:**

* Iterating over arrays
* Running something for a fixed number of times

---

### 2. **`while` Loop**

**Use When:** You don't know how many times you'll loop, but want to continue as long as a condition is true.

```java
int i = 0;
while (i < 5) {
    System.out.println("Count: " + i);
    i++;
}
```

📌 **Example Use Cases:**

* Reading user input until a certain value
* Polling for a condition

---

### 3. **`do-while` Loop**

**Use When:** You want the code to run at least once, even if the condition is false the first time.

```java
int i = 0;
do {
    System.out.println("Count: " + i);
    i++;
} while (i < 5);
```

📌 **Example Use Cases:**

* Menus or actions that must run once before checking a condition

---

### 4. **Enhanced `for` Loop (for-each)**

**Use When:** You want to loop over arrays or collections without using an index.

```java
int[] numbers = {10, 20, 30, 40};
for (int num : numbers) {
    System.out.println("Number: " + num);
}
```

📌 **Example Use Cases:**

* Looping through arrays or `ArrayList`

---

## ⚖️ When to Use Which Loop?

| Scenario                        | Best Loop       |
| ------------------------------- | --------------- |
| Fixed number of iterations      | `for` loop      |
| Unknown number of iterations    | `while` loop    |
| Must run at least once          | `do-while` loop |
| Iterating over array/collection | Enhanced `for`  |

---

## 🧠 Practice Questions

1. Print numbers 1 to 10 using a `for` loop.
2. Keep asking the user for a password until they enter the correct one (use `while`).
3. Print even numbers from 1 to 20 using any loop.
4. Loop through an array of student names using `for-each`.
5. Use a `do-while` loop to create a basic menu system.

---

## ✅ Tips

* Always make sure your loop has a **termination condition**, or it may become infinite.
* Prefer enhanced `for` loop when you don’t need the index.
* Use `break` to exit a loop early and `continue` to skip current iteration.

```java
for (int i = 0; i < 10; i++) {
    if (i == 5) continue; // Skip 5
    if (i == 8) break;    // Stop at 8
    System.out.println(i);
}
```

---

Happy looping! 💻🎯
