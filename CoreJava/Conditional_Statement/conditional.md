# ✅ Java Conditional Statements

Conditional statements allow your program to make decisions based on conditions (true or false).

---

## 🔹 1. `if` Statement

Executes a block of code **only if** the condition is true.

```java
int age = 18;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

---

## 🔸 2. `if-else` Statement

Executes one block if the condition is true, and another if it is false.

```java
int age = 16;
if (age >= 18) {
    System.out.println("Eligible to vote");
} else {
    System.out.println("Not eligible");
}
```

---

## 🔹 3. `if-else if-else` Ladder

Tests multiple conditions in sequence.

```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 75) {
    System.out.println("Grade B");
} else if (marks >= 60) {
    System.out.println("Grade C");
} else {
    System.out.println("Fail");
}
```

---

## 🔸 4. `switch` Statement

Better than multiple `if-else` blocks when testing a single variable against many values.

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    default:
        System.out.println("Invalid day");
}
```

✅ Use `break` to prevent fall-through.
✅ `default` is optional but recommended.

---

## 🧠 Practice Questions (Conditionals)

1. Check if a number is even or odd.
2. Find the largest of three numbers.
3. Write a program to check whether a year is a leap year.
4. Use `switch` to create a basic calculator (add, subtract, multiply, divide).

---

## ✅ Tips

* Conditions must return a boolean (`true` or `false`).
* Use `==` for comparison, not `=` (assignment).
* Prefer `switch` for clear, fixed-value branching.

---

