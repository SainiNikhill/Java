# Java Operators

Java provides a rich set of operators to perform operations on variables and values. Operators in Java can be categorized into several types:

---

## 1. Arithmetic Operators

Used for basic mathematical operations.

| Operator | Description      | Example      |
|----------|------------------|--------------|
| `+`      | Addition          | `a + b`      |
| `-`      | Subtraction       | `a - b`      |
| `*`      | Multiplication    | `a * b`      |
| `/`      | Division          | `a / b`      |
| `%`      | Modulus (remainder) | `a % b`   |

---

## 2. Relational (Comparison) Operators

Used to compare two values.

| Operator | Description           | Example      |
|----------|-----------------------|--------------|
| `==`     | Equal to              | `a == b`     |
| `!=`     | Not equal to          | `a != b`     |
| `>`      | Greater than          | `a > b`      |
| `<`      | Less than             | `a < b`      |
| `>=`     | Greater than or equal | `a >= b`     |
| `<=`     | Less than or equal    | `a <= b`     |

---

## 3. Logical Operators

Used for logical (boolean) expressions.

| Operator | Description   | Example           |
|----------|---------------|-------------------|
| `&&`     | Logical AND    | `(a > b && c > d)` |
| `||`     | Logical OR     | `(a > b || c > d)` |
| `!`      | Logical NOT    | `!(a > b)`        |

---

## 4. Assignment Operators

Used to assign values to variables.

| Operator | Description       | Example      |
|----------|-------------------|--------------|
| `=`      | Assign value       | `a = 10`     |
| `+=`     | Add and assign     | `a += 5` → `a = a + 5` |
| `-=`     | Subtract and assign| `a -= 5`     |
| `*=`     | Multiply and assign| `a *= 2`     |
| `/=`     | Divide and assign  | `a /= 3`     |
| `%=`     | Modulo and assign  | `a %= 2`     |

---

## 5. Unary Operators

Operate on a single operand.

| Operator | Description                | Example      |
|----------|----------------------------|--------------|
| `+`      | Unary plus                  | `+a`         |
| `-`      | Unary minus                 | `-a`         |
| `++`     | Increment (prefix/postfix)  | `++a`, `a++` |
| `--`     | Decrement (prefix/postfix)  | `--a`, `a--` |
| `!`      | Logical NOT                 | `!a`         |

---

## 6. Bitwise Operators

Operate on bits and perform bit-by-bit operations.

| Operator | Description        | Example  |
|----------|--------------------|----------|
| `&`      | Bitwise AND        | `a & b`  |
| `|`      | Bitwise OR         | `a | b`  |
| `^`      | Bitwise XOR        | `a ^ b`  |
| `~`      | Bitwise Complement | `~a`     |
| `<<`     | Left Shift         | `a << 2` |
| `>>`     | Right Shift        | `a >> 2` |
| `>>>`    | Unsigned Right Shift | `a >>> 2` |

---

## 7. Ternary Operator

Short form of if-else.

```java
int result = (a > b) ? a : b;
