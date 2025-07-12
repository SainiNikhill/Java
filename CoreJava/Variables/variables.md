# 🧮 Java Variables & Data Types

## 📌 What is a Variable?

A variable is a **named memory location** used to store data in a program.

### Syntax:

```java
dataType variableName = value;
```

### Example:

```java
int age = 25;
String name = "John";
```

---

## 🧪 Data Types in Java

### 1. **Primitive Data Types** (8 types)

| Type      | Size    | Example    |
| --------- | ------- | ---------- |
| `int`     | 4 bytes | 10         |
| `float`   | 4 bytes | 10.5f      |
| `double`  | 8 bytes | 15.76      |
| `char`    | 2 bytes | 'A'        |
| `boolean` | 1 bit   | true/false |
| `byte`    | 1 byte  | 127        |
| `short`   | 2 bytes | 32000      |
| `long`    | 8 bytes | 123456L    |

### 2. **Non-Primitive (Reference) Types**

* Strings, Arrays, Classes, Interfaces, etc.

```java
String message = "Hello World";
```

---

## 💡 Variable Rules

* Must start with a letter, `_`, or `$`
* Cannot start with a digit
* Case-sensitive: `age` and `Age` are different
* Meaningful names are recommended (`totalMarks` not `x`)

---

## 🧠 Practice Questions (Variables)

1. Declare variables of all 8 primitive data types.
2. Create a string variable and print its value.
3. Write a program to swap two variables.
4. Add two integers and display the result.

---

## ✅ Tips

* Use `var` (Java 10+) for automatic type inference:

```java
var x = 42; // inferred as int
var text = "Java"; // inferred as String
```

* Always initialize variables before using them.

---

Happy coding! ☕💻
