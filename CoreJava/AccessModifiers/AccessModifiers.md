# Access Modifiers in Java

## Overview

Access modifiers control the *visibility* and *access* of classes, methods, constructors, and variables. They are fundamental to **encapsulation**—a core pillar of object‑oriented programming.

Java provides **four** access modifiers:

| Order of Restrictiveness | Keyword                     | Visible To                                        |
| ------------------------ | --------------------------- | ------------------------------------------------- |
| 1 (Most Restrictive)     | `private`                   | Same class only                                   |
| 2                        | *default* (package‑private) | All classes in the **same package**               |
| 3                        | `protected`                 | Same package **and** subclasses in other packages |
| 4 (Least Restrictive)    | `public`                    | All classes everywhere                            |

---

## 1. `private`

* **Scope & Visibility:** Only inside the *declaring class*.
* **Typical Use:** Data hiding—instance fields, helper methods.

```java
class Account {
    private double balance;          // hidden field

    private void log(String msg) {   // hidden helper
        System.out.println(msg);
    }
}
```

---

## 2. *default* (package‑private)

* **Scope & Visibility:** Any class in the **same package**.
* **Declaration:** Simply omit an explicit modifier.

```java
// file: banking/Loan.java
package banking;

class Loan {                // package‑private
    void approve() {        // package‑private
        System.out.println("Loan approved");
    }
}
```

> **Note:** Ideal for grouping related implementation classes that should not leak outside the package’s API surface.

---

## 3. `protected`

* **Scope & Visibility:**

  1. Same package (like *default*), **plus**
  2. Subclasses in *other* packages.
* **Typical Use:** Expose state/behaviour for inheritance while still hiding it from the wider world.

```java
package animals;

public class Animal {
    protected void breathe() {
        System.out.println(" breathing …");
    }
}

// Different package
package pets;

import animals.Animal;

public class Dog extends Animal {
    public void bark() {
        breathe();           // accessible via inheritance
        System.out.println("woof!");
    }
}
```

> **Design tip:** Avoid making fields `protected`; prefer `private` with `protected` getters/setters to keep flexibility.

---

## 4. `public`

* **Scope & Visibility:** Everywhere—no restrictions.
* **Typical Use:** API classes, constructors, and methods intended for any client code.

```java
package util;

public class StringUtils {
    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }
}
```

---

## Quick Reference Tables

### A. Member Visibility Matrix

| Modifier    | Same Class | Same Package | Subclass (diff pkg) | Other Pkgs |
| ----------- | ---------: | -----------: | ------------------: | ---------: |
| `private`   |          ✅ |            ❌ |                   ❌ |          ❌ |
| *default*   |          ✅ |            ✅ |                   ❌ |          ❌ |
| `protected` |          ✅ |            ✅ |                   ✅ |          ❌ |
| `public`    |          ✅ |            ✅ |                   ✅ |          ✅ |

### B. Allowed on Top‑Level Declarations

| Top‑level Element     | `private` | *default* | `protected` | `public` |
| --------------------- | --------- | --------- | ----------- | -------- |
| **Class / Interface** | ❌         | ✅         | ❌           | ✅        |
| **Enum / Record**     | ❌         | ✅         | ❌           | ✅        |

---

## Capacity for Growth

If you expect heavy mutation of a `String`‑like value, prefer `StringBuilder`/`StringBuffer` rather than exposing a `public` `String` field. Use `private` for storage and provide controlled `public`/`protected` accessors.

---

## Best‑Practice Guidelines

1. **Start `private`, relax only when required**.
2. Use `protected` sparingly; favour composition over inheritance.
3. Keep top‑level API surface minimal—expose only what callers need.
4. Document intent with Javadoc comments for every `public`/`protected` member.

---

## Example Summary Class

```java
public class AccessDemo {
    // fields
    private int secret = 42;
             int packageId = 7;       // default
    protected String nickname = "Niks";
    public double pi = Math.PI;

    // methods
    private void whisper() {}
            void speak() {}
    protected void announce() {}
    public void broadcast() {}
}
```

---

### Conclusion

Choosing the **most restrictive** access level that still satisfies requirements enforces encapsulation, eases maintenance, and prevents accidental misuse of your APIs.
