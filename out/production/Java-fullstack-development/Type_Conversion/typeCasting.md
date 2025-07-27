# 🔄 Java Type Casting

Type casting in Java is the process of converting a variable from one data type to another. There are two types:

---

## 🔹 1. **Widening Casting (Implicit)**

Automatically done by Java when converting a **smaller type to a larger type**.

### Order:

`byte` → `short` → `int` → `long` → `float` → `double`

### Example:

```java
int myInt = 9;
double myDouble = myInt; // Automatic casting: int to double
System.out.println(myInt);      // 9
System.out.println(myDouble);   // 9.0
```

✅ No data loss
✅ No explicit cast required

---

## 🔸 2. **Narrowing Casting (Explicit)**

You must manually convert a **larger type into a smaller size type**.

### Example:

```java
double myDouble = 9.78;
int myInt = (int) myDouble; // Manual casting: double to int
System.out.println(myDouble);   // 9.78
System.out.println(myInt);      // 9
```

⚠️ Data loss may occur (decimal part lost)
⚠️ Cast must be explicitly specified

---

## ⚠️ Type Casting & Data Loss

```java
int a = 130;
byte b = (byte) a;
System.out.println(b); // Output: -126 (due to overflow)
```

* Java `byte` range is -128 to 127
* Casting outside this range causes **overflow** or **data truncation**

---

## 🧠 Practice Questions (Type Casting)

1. Convert an `int` to a `float` and print both.
2. Convert a `double` to an `int` and explain what gets lost.
3. Try casting `int a = 260;` to `byte` and observe output.
4. What happens if you cast a `char` to an `int`?

---

## ✅ Tips

* Always cast carefully when narrowing.
* Use `instanceof` to check object types before casting in object-oriented code.
* Avoid unnecessary casts—they clutter code.

---


